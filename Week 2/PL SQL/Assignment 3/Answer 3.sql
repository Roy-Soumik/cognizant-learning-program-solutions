CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_account IN Accounts.AccountID%TYPE,
  p_to_account IN Accounts.AccountID%TYPE,
  p_amount IN NUMBER
) AS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance
  FROM Accounts
  WHERE AccountID = p_from_account;

  IF v_balance < p_amount THEN
    DBMS_OUTPUT.PUT_LINE('Transfer failed: Insufficient funds.');
    RETURN;
  END IF;

  UPDATE Accounts
  SET Balance = Balance - p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_from_account;

  UPDATE Accounts
  SET Balance = Balance + p_amount,
      LastModified = SYSDATE
  WHERE AccountID = p_to_account;

  DBMS_OUTPUT.PUT_LINE('Transfer of $' || p_amount || ' completed successfully.');
END;
/
