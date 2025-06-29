DECLARE
  v_c_id Customers.CustomerID%TYPE;
  v_dob Customers.DOB%TYPE;
  v_age NUMBER;
BEGIN
  FOR c_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
    v_c_id := c_rec.CustomerID;
    v_dob := c_rec.DOB;
    v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, v_dob) / 12);

    IF v_age > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate - 1
      WHERE CustomerID = v_c_id;
    END IF;
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('Interest rate discount applied for eligible customers.');
END;
/