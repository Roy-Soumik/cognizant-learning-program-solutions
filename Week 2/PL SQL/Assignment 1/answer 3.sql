SET SERVEROUTPUT ON;

DECLARE
    v_c_name Customers.Name%TYPE;
    v_c_id Loans.CustomerID%TYPE;
    v_l_id Loans.LoanID%TYPE;
    v_dd Loans.EndDate%TYPE;
    v_amt Loans.LoanAmount%TYPE;

    CURSOR lc IS
        SELECT LoanID, CustomerID, LoanAmount, EndDate
        FROM Loans
        WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30;

BEGIN
    FOR lr IN lc LOOP
        SELECT Name INTO v_c_name
        FROM Customers
        WHERE CustomerID = lr.CustomerID;

        v_c_id := lr.CustomerID;
        v_l_id := lr.LoanID;
        v_dd := lr.EndDate;
        v_amt := lr.LoanAmount;

        DBMS_OUTPUT.PUT_LINE('Reminder: ' || v_c_name || ', loan (ID: ' || v_l_id || ') of amount $' || v_amt || ' is due on ' || TO_CHAR(v_dd, 'DD-MM-YYYY') || '. Please pay in time.');
    END LOOP;
END;



