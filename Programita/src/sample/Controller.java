package sample;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextField tol, i0, i1, i2, i3, i4, i5, x0, x1, x2, x3, x4, x5, y0, y1, y2, y3, y4, y5, z0, z1, z2, z3, z4, z5, d0, d1, d2, d3, d4, d5;
    @FXML
    Button b1, b2, b3, b4, b5, b6;

    public void calcularSig1(Event event) {
       /* double t=Double.parseDouble(tol.getText());
        double x=Double.parseDouble(x0.getText());
        double y=Double.parseDouble(y0.getText());
        double z=Double.parseDouble(z0.getText());
        double d=Double.parseDouble(d0.getText());*/
        double t = Double.parseDouble(tol.getText());
        double x = Double.parseDouble(x0.getText());
        double y = Double.parseDouble(y0.getText());
        double z = Double.parseDouble(z0.getText());
        double d = Double.parseDouble(d0.getText());

        if (tol.getText().isEmpty() == true || x0.getText().isEmpty() == true || y0.getText().isEmpty() == true ||
                z0.getText().isEmpty() == true || d0.getText().isEmpty() == true) {
            x1.setVisible(false);
            y1.setVisible(false);
            z1.setVisible(false);
            d1.setVisible(false);
            b2.setVisible(false);
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Advertencia");
            alerta.setContentText("Favor de llenar todos los campos");
            alerta.show();
        } else {
            i1.setVisible(true);
            x1.setVisible(true);
            y1.setVisible(true);
            z1.setVisible(true);
            d1.setVisible(true);
            b2.setVisible(true);
            tol.setDisable(true);
            x0.setDisable(true);
            y0.setDisable(true);
            z0.setDisable(true);
            d0.setDisable(true);
            b1.setDisable(true);
            b2.setDisable(false);
            /*double sum=t+x;
            i0.setText(sum+"");*/
        }
    }

    public void calcularSig2(Event event) {

        double x=(7.85+(0.1*Double.parseDouble(x0.getText()))+(0.2*Double.parseDouble(z0.getText())))/3;
        x1.setText(x+"");
        double y=(-19.3-(0.1*Double.parseDouble(x1.getText()))+(0.3*Double.parseDouble(z0.getText())))/7;
        y1.setText(y+"");
        double z=(71.4-(0.3*Double.parseDouble(x1.getText()))+(0.2*Double.parseDouble(y1.getText())))/10;
        z1.setText(z+"");
        double di=Math.sqrt(((Double.parseDouble(x1.getText())-Double.parseDouble(x0.getText()))*((Double.parseDouble(x1.getText())-Double.parseDouble(x0.getText())))+
                ((Double.parseDouble(y1.getText())-Double.parseDouble(y0.getText()))*(Double.parseDouble(y1.getText())-Double.parseDouble(y0.getText())))+
        ((Double.parseDouble(z1.getText())-Double.parseDouble(z0.getText()))*((Double.parseDouble(z1.getText())-Double.parseDouble(z0.getText()))))));
        d1.setText(di+"");

        if(Double.parseDouble(d1.getText())<Double.parseDouble(tol.getText())){
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Tu resultado fue\n"+"x: \n"+x+"\ny: \n"+y+"\nz: \n"+z+"\nDi(tol): \n"+di);
            alerta.show();
        }else {
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Sigue");
            alerta.show();
            i2.setVisible(true);
            x2.setVisible(true);
            y2.setVisible(true);
            z2.setVisible(true);
            d2.setVisible(true);
            b2.setVisible(true);
            b3.setVisible(true);
            tol.setDisable(true);
            x1.setDisable(true);
            y1.setDisable(true);
            z1.setDisable(true);
            d1.setDisable(true);
            b2.setDisable(true);
            b3.setDisable(false);

        }

    }

    public void calcularSig3(Event event){
        double x=(7.85+(0.1*Double.parseDouble(y1.getText()))+(0.2*Double.parseDouble(z1.getText())))/3;
        x2.setText(x+"");
        double y=(-19.3-(0.1*Double.parseDouble(x2.getText()))+(0.3*Double.parseDouble(z1.getText())))/7;
        y2.setText(y+"");
        double z=(71.4-(0.3*Double.parseDouble(x2.getText()))+(0.2*Double.parseDouble(y2.getText())))/10;
        z2.setText(z+"");
        double di=Math.sqrt(((Double.parseDouble(x2.getText())-Double.parseDouble(x1.getText()))*((Double.parseDouble(x2.getText())-Double.parseDouble(x1.getText())))+
                ((Double.parseDouble(y2.getText())-Double.parseDouble(y1.getText()))*(Double.parseDouble(y2.getText())-Double.parseDouble(y1.getText())))+
                ((Double.parseDouble(z2.getText())-Double.parseDouble(z1.getText()))*((Double.parseDouble(z2.getText())-Double.parseDouble(z1.getText()))))));
        d2.setText(di+"");

        if(Double.parseDouble(d2.getText())<Double.parseDouble(tol.getText())){
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Tu resultado fue\n"+"x: \n"+x+"\ny: \n"+y+"\nz: \n"+z+"\nDi(tol): \n"+di);
            alerta.show();
        }else {
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Sigue");
            alerta.show();
            i3.setVisible(true);
            x3.setVisible(true);
            y3.setVisible(true);
            z3.setVisible(true);
            d3.setVisible(true);
            b3.setVisible(true);
            b4.setVisible(true);
            tol.setDisable(true);
            x2.setDisable(true);
            y2.setDisable(true);
            z2.setDisable(true);
            d2.setDisable(true);
            b3.setDisable(true);
            b4.setDisable(false);
    }

    }

    public void calcularSig4(Event event){
        double x=(7.85+(0.1*Double.parseDouble(y2.getText()))+(0.2*Double.parseDouble(z2.getText())))/3;
        x3.setText(x+"");
        double y=(-19.3-(0.1*Double.parseDouble(x3.getText()))+(0.3*Double.parseDouble(z2.getText())))/7;
        y3.setText(y+"");
        double z=(71.4-(0.3*Double.parseDouble(x3.getText()))+(0.2*Double.parseDouble(y3.getText())))/10;
        z3.setText(z+"");
        double di=Math.sqrt(((Double.parseDouble(x3.getText())-Double.parseDouble(x2.getText()))*((Double.parseDouble(x3.getText())-Double.parseDouble(x2.getText())))+
                ((Double.parseDouble(y3.getText())-Double.parseDouble(y2.getText()))*(Double.parseDouble(y3.getText())-Double.parseDouble(y2.getText())))+
                ((Double.parseDouble(z3.getText())-Double.parseDouble(z2.getText()))*((Double.parseDouble(z3.getText())-Double.parseDouble(z2.getText()))))));
        d3.setText(di+"");

        if(Double.parseDouble(d3.getText())<Double.parseDouble(tol.getText())){
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Tu resultado fue\n"+"x: \n"+x+"\ny: \n"+y+"\nz: \n"+z+"\nDi(tol): \n"+di);
            alerta.show();
        }else {
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Sigue");
            alerta.show();
            i4.setVisible(true);
            x4.setVisible(true);
            y4.setVisible(true);
            z4.setVisible(true);
            d4.setVisible(true);
            b4.setVisible(true);
            b5.setVisible(true);
            tol.setDisable(true);
            x3.setDisable(true);
            y3.setDisable(true);
            z3.setDisable(true);
            d3.setDisable(true);
            b4.setDisable(true);
            b5.setDisable(false);
        }
    }

    public void calcularSig5(Event event){
        double x=(7.85+(0.1*Double.parseDouble(y3.getText()))+(0.2*Double.parseDouble(z3.getText())))/3;
        x4.setText(x+"");
        double y=(-19.3-(0.1*Double.parseDouble(x4.getText()))+(0.3*Double.parseDouble(z3.getText())))/7;
        y4.setText(y+"");
        double z=(71.4-(0.3*Double.parseDouble(x4.getText()))+(0.2*Double.parseDouble(y4.getText())))/10;
        z4.setText(z+"");
        double di=Math.sqrt(((Double.parseDouble(x4.getText())-Double.parseDouble(x3.getText()))*((Double.parseDouble(x4.getText())-Double.parseDouble(x3.getText())))+
                ((Double.parseDouble(y4.getText())-Double.parseDouble(y3.getText()))*(Double.parseDouble(y4.getText())-Double.parseDouble(y3.getText())))+
                ((Double.parseDouble(z4.getText())-Double.parseDouble(z3.getText()))*((Double.parseDouble(z4.getText())-Double.parseDouble(z3.getText()))))));
        d4.setText(di+"");

        if(Double.parseDouble(d4.getText())<Double.parseDouble(tol.getText())){
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Tu resultado fue\n"+"x: \n"+x+"\ny: \n"+y+"\nz: \n"+z+"\nDi(tol): \n"+di);
            alerta.show();
        }else {
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Sigue");
            alerta.show();
            i5.setVisible(true);
            x5.setVisible(true);
            y5.setVisible(true);
            z5.setVisible(true);
            d5.setVisible(true);
            b5.setVisible(true);
            b6.setVisible(true);
            tol.setDisable(true);
            x4.setDisable(true);
            y4.setDisable(true);
            z4.setDisable(true);
            d4.setDisable(true);
            b4.setDisable(true);
            b6.setDisable(false);
        }
    }

    public void calcularSig6(Event event){
        double x=(7.85+(0.1*Double.parseDouble(y4.getText()))+(0.2*Double.parseDouble(z4.getText())))/3;
        x5.setText(x+"");
        double y=(-19.3-(0.1*Double.parseDouble(x5.getText()))+(0.3*Double.parseDouble(z4.getText())))/7;
        y5.setText(y+"");
        double z=(71.4-(0.3*Double.parseDouble(x5.getText()))+(0.2*Double.parseDouble(y5.getText())))/10;
        z5.setText(z+"");
        double di=Math.sqrt(((Double.parseDouble(x5.getText())-Double.parseDouble(x4.getText()))*((Double.parseDouble(x5.getText())-Double.parseDouble(x4.getText())))+
                ((Double.parseDouble(y5.getText())-Double.parseDouble(y4.getText()))*(Double.parseDouble(y5.getText())-Double.parseDouble(y4.getText())))+
                ((Double.parseDouble(z5.getText())-Double.parseDouble(z4.getText()))*((Double.parseDouble(z5.getText())-Double.parseDouble(z4.getText()))))));
        d5.setText(di+"");

        if(Double.parseDouble(d5.getText())<Double.parseDouble(tol.getText())){
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Tu resultado fue\n"+"x: \n"+x+"\ny: \n"+y+"\nz: \n"+z+"\nDi(tol): \n"+di);
            alerta.show();

        }else {
            Alert alerta=new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("RESULTADO");
            alerta.setContentText("Sigue");
            alerta.show();
            i5.setVisible(true);
            x5.setVisible(true);
            y5.setVisible(true);
            z5.setVisible(true);
            d5.setVisible(true);
            b6.setVisible(true);
            b6.setVisible(true);
            tol.setDisable(true);
            x5.setDisable(true);
            y5.setDisable(true);
            z5.setDisable(true);
            d5.setDisable(true);
            b5.setDisable(true);
        }
    }
}
