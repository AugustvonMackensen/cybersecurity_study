<% 
    String id = request.getParameter("id"); // Get id
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.query("select * from users where id = '" + id + "'")
%>