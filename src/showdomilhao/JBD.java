
package showdomilhao;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JLabel;




public class JBD {
    
    public String dados[] = new String[5];
    public String p;
    public String a1;
    public String a2;
    public String a3;
    public String a4;
    public String top1Name, top2Name, top3Name, top4Name;
    public int top1Points, top2Points, top3Points, top4Points;
    
       public void ManipularDados(String query)
   {
    try
      {   
        Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quizztec", "Giu", "acsa");
        String sql = query;
        PreparedStatement grava = (PreparedStatement) con.prepareStatement(sql); 
 
        // executa e encerra o comando
        grava.executeUpdate();        
        grava.close(); 
        
        // testa no console para verificar algum erro!
        System.out.println("Gravado!");
        
        //encerra a conexão
        con.close();
      } 
        catch (SQLException ex)
      {
          System.out.println("Erro " + ex);
      }
   } 
       
          public String[] Consulta(String consulta) 
    {
         
        try
        {
         Connection con =  (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/quizztec", "Giu", "acsa");
         PreparedStatement banco = (PreparedStatement)con.prepareStatement(consulta);
         banco.execute(); // cria o vetor
        

         ResultSet resultado = banco.executeQuery(consulta);

         while(resultado.next())
         {
           
            if (consulta.contains("tb_ranking")) {
             int rank = 1;
                while (resultado.next() && rank <= 4) {

                    switch (rank) {
                        case 1:
                            top1Name = resultado.getString("nome");
                            top1Points = resultado.getInt("pontos");
                            break;
                        case 2:
                            top2Name = resultado.getString("nome");
                            top2Points = resultado.getInt("pontos");
                            break;
                        case 3:
                            top3Name = resultado.getString("nome");
                            top3Points = resultado.getInt("pontos");
                            break;
                        case 4:
                            top4Name = resultado.getString("nome");
                            top4Points = resultado.getInt("pontos");
                            break;
                    }
                    rank++;
                }
                
            }else{
                p = resultado.getString("pergunta");
                a1 = resultado.getString("alternativa_correta"); 
                a2 = resultado.getString("alternativa_errada1");
                a3 = resultado.getString("alternativa_errada2");
                a4 = resultado.getString("alternativa_errada3");
            }
            
            
             System.out.println("jll");
            
         } 
         
        
//         if (consulta.contains("tb_ranking")) {
//                int rank = 1;
//                while (resultado.next() && rank <= 4) {
//
//                    switch (rank) {
//                        case 1:
//                            top1Name = resultado.getString("nome");
//                            top1Points = resultado.getInt("pontos");
//                            break;
//                        case 2:
//                            top2Name = resultado.getString("nome");
//                            top2Points = resultado.getInt("pontos");
//                            break;
//                        case 3:
//                            top3Name = resultado.getString("nome");
//                            top3Points = resultado.getInt("pontos");
//                            break;
//                        case 4:
//                            top4Name = resultado.getString("nome");
//                            top4Points = resultado.getInt("pontos");
//                            break;
//                    }
//                    rank++;
//                }
//         }
         
         banco.close();
         con.close();
         
        }
        catch (SQLException ex)
        {
          System.out.println("o erro foi " +ex);
        }
        return dados;
    }

    
}

