package Main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DAO.OracleConnection;

public class Runner {
	private static final String FILENAME = "employee.html";

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			String html = ExportTableToHtml();

			fw = new FileWriter(FILENAME);
			bw = new BufferedWriter(fw);
			bw.write(html);

			System.out.println("Done");
		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();
		}
			
	}

	public static String ExportTableToHtml() {
		
		Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet result = null;
        String selectAll = "SELECT * FROM {tableName}";
		
        try {
			conn = OracleConnection.getConnection();
            stmt = conn.prepareStatement(selectAll);
            result = stmt.executeQuery();
/*********/            
            IDataReader reader = command.ExecuteReader();
    		XElement table = new XElement("table");
    		while (reader.Read())
    		{
    			XElement row = new XElement("tr");
    			for(int nField=0;nField<reader.FieldCount;++nField)
    			{
    				XElement cell = new XElement("td");
    				object value = reader[nField];
    				if (value != DBNull.Value)
    				{
    					if (value.GetType().Name == "DateTime")
    					{
    						DateTime date = (DateTime)value;
    						value = date.ToLongDateString();
    					}
    					cell.Add(value);
    				}
    				row.Add(cell);
    			}
    			table.Add(row);
    		}
    		
        } catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		} finally {
            result.close();
            if(stmt != null){
                stmt.close();
            }
            if(conn != null){
                conn.close();
            }
        }
        return table.ToString();
/*********/          
	}
}

