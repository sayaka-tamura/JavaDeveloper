package CoreJava.util;

public class OracleQueries {
	/* ---------- Shopping DAO ---------- */
		/* --- Create --- */
	public final static String CREATESHOPPINGID = "INSERT INTO SHOPPING_F "
		+ "(SHOPPING_TOTAL_EXPENSE, SHOPPING_TAX)"
		+ "VALUES(?,?)";
	
	public final static String UPDATEITEM_SHOPPINGID = "UPDATE ITEM_F "
			+ "SET ITEM_SHOPPING_ID = ? "
			+ "WHERE ITEM_ID = ?";

		/* --- Read --- */
	public final static String GETAllSHOPPINGRECORD = "SELECT * FROM SHOPPING_F";

	public final static String GETSHOPPINGBYID = "SELECT * FROM SHOPPING_F WHERE SHOPPING_ID = ?";
	
		/* --- Update --- */
    public static final String UPDATESHOPPINGINFO = "UPDATE SHOPPING_F "
    		+ "SET SHOPPING_TOTAL_EXPENSE = ?, SHOPPING_TAX = ?"
    		+ "WHERE SHOPPING_ID = ?";
		/* --- Delete --- */
    public final static String DELETESHOPPINGBYID = "DELETE SHOPPING_F WHERE SHOPPING_ID = ?";

    public final static String DELETEALLSHOPPING = "DELETE SHOPPING_F";
	
	/* ---------- Item DAO ---------- */
    	/* --- Create --- */
	public final static String ADDSHOPPEDITEM = "INSERT INTO ITEM_F "
			+ "(ITEM_DATE, ITEM_NAME, ITEM_PRICE, ITEM_QUANTITIY, ITEM_CATEGORY)"
			+ "VALUES(?,?,?,?,?)";
		/* --- Read --- */
	public final static String GETAllITEMHISTORY = "SELECT * FROM ITEM_F";
	
	public final static String GETITEMBYITEMID = "SELECT * FROM ITEM_F WHERE ITEM_ID = ?";
	
	public final static String GETITEMBYITEMSHOPPINGID = "SELECT * FROM ITEM_F WHERE SHOPPING_ID = ?";
		/* --- Update --- */
    public static final String UPDATEITEMINFO = "UPDATE ITEM_F "
    		+ "SET ITEM_NAME = ?, ITEM_PRICE = ?, ITEM_QUANTITIY = ?, ITEM_CATEGORY = ? "
    		+ "WHERE ITEM_ID = ?";
    	/* --- Delete --- */
    public final static String DELETEITEMBYID = "DELETE ITEM_F WHERE ITEM_ID = ?";
    
    public final static String DELETEALLITEM = "DELETE ITEM_F";
    
    /* ---------- User DAO ---------- */
    	/* --- Create --- */
    public final static String ADDNEWUSER = "INSERT INTO USER_F "
			+ "(USER_FNAME, USER_LNAME, USER_EMAIL, USER_PASSWORD)"
			+ "VALUES(?,?,?,?)";
		/* --- Read --- */    
    public final static String GETUSERBYEMAILANDPASS = "SELECT * FROM USER_F "
            + "WHERE USER_EMAIL = ? AND USER_PASSWORD = ?";
    
    public final static String GETUSERBYITEMID = "SELECT * FROM USER_F WHERE USER_ID = ?";
    
		/* --- Update --- */
    public static final String UPDATEUSER = "UPDATE USER_F "
    		+ "SET USER_FNAME = ?, USER_LNAME = ?, USER_EMAIL = ?, USER_PASSWORD = ? "
    		+ "WHERE USER_ID = ?";
    	/* --- Delete --- */
    public final static String DELETEUSERBYID = "DELETE USER_F WHERE USER_ID = ?";
    
    
    
    
    
    
}
