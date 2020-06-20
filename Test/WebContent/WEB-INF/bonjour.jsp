<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Test</title>
    </head>

    <body>
      <%@ include file = "menu.jsp" %>
        <p>
            Bonjour 
            <%
                    String name = (String) request.getAttribute("name");
                                  
                    out.print(name  );
             
            %>
                    
            <%
                      String prename = (String) request.getAttribute("prename");
                      out.print(prename  );
            %>
            , agé de 
            <%
                    String age = (String) request.getAttribute("age");
                    out.print(age    );
            %>
            ans, 
            résident à
                       
            
            <%
                     String ville = (String) request.getAttribute("ville");
                     out.print(ville   );
            %>
            
        </p>
        
    </body>
</html>