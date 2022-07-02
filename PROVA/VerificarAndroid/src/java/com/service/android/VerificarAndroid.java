package com.service.android;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebService(
 name = "VerificarAndroid",
 serviceName = "VerificarAndroidService")

public class VerificarAndroid {
    private static final String banco = "jdbc:derby://localhost:1527/AndroidPessoal";
    private static final String usuario = "prova2";
    private static final String senha = "prova2";
    private Connection conexao;
    private PreparedStatement buscar;
    private PreparedStatement reservarandroid;

    @WebMethod(operationName = "checarandroid")
    public boolean checarandroid(@WebParam(name = "digital") String digital, @WebParam(name = "modelo") String modelo) {

    try {
        conexao = DriverManager.getConnection(banco,usuario,senha);
        buscar = conexao.prepareStatement("Select id from ROBO where disponibilidade = 0 and digital = ? and modelo = ?");

        buscar.setString(1, digital);
        buscar.setString(2, modelo);
        ResultSet resultado = buscar.executeQuery();

            if (resultado.next()){
                int android = resultado.getInt(1);
                reservarandroid = conexao.prepareStatement("Update ROBO set disponibilidade = 1 where id=? ");
                reservarandroid.setInt(1, android);
                reservarandroid.executeUpdate();
                return true;
            }
        return false;
    }
    
    catch(SQLException e){
        e.printStackTrace();
        return false;
    }
}
}
