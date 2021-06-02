import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.event.EventHandler;




import java.text.NumberFormat;


public class Main extends Application {

    Stage window; //holding  window
    Scene s1;  //holding  s1,s2,s3,s4,s5,sH
    Scene s2;
    Scene s3;
    Scene s4;
    Scene s5;
    Scene sH;

    double n; //holding n,P,r,t,PMT,A,PV
    double P;
    double r;
    double t;
    double PMT;
    double A;
    double PV;

    TextField textField; //holding  textfield

    public static void main(String[] args) {


        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("Finance Calculator");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(2,12,12,12));
        gridPane.setVgap(10);
        gridPane.setHgap(12);






        //compound interest
        //set title
        primaryStage.setTitle("Compound Interest");
        //create label
        Label lbc1 = new Label("Present Value");
        lbc1.setLayoutY(100);
        lbc1.setLayoutX(50);
        Label lbc2 = new Label("Interest Rate");
        lbc2.setLayoutY(150);
        lbc2.setLayoutX(50);
        Label lbc3 = new Label("Time in year");
        lbc3.setLayoutY(200);
        lbc3.setLayoutX(50);
        Label lbc4 = new Label("No of Months");
        lbc4.setLayoutY(250);
        lbc4.setLayoutX(50);
        Label lbc5 = new Label("Future Value");
        lbc5.setLayoutY(300);
        lbc5.setLayoutX(50);

        //create textfield
        TextField txtc1 = new TextField();
        txtc1.setLayoutX(150);
        txtc1.setLayoutY(100);
        TextField txtc2 = new TextField();
        txtc2.setLayoutX(150);
        txtc2.setLayoutY(150);
        TextField txtc3 = new TextField();
        txtc3.setLayoutX(150);
        txtc3.setLayoutY(200);
        TextField txtc4 = new TextField();
        txtc4.setLayoutX(150);
        txtc4.setLayoutY(250);
        TextField txtc5 = new TextField();
        txtc5.setLayoutX(150);
        txtc5.setLayoutY(300);

        //set event for textfield in compound interest
        txtc1.setOnMouseClicked(event -> {
            textField = txtc1;
        });
        txtc2.setOnMouseClicked(event -> {
            textField = txtc2;
        });
        txtc3.setOnMouseClicked(event -> {
            textField = txtc3;
        });
        txtc4.setOnMouseClicked(event -> {
            textField = txtc4;
        });
        txtc5.setOnMouseClicked(event -> {
            textField = txtc5;
        });

        //create calculator buttons in compound interest
        Button buc1 = new Button("1");
        buc1.setLayoutY(400);
        buc1.setLayoutX(250);
        Button buc2 = new Button("2");
        buc2.setLayoutY(400);
        buc2.setLayoutX(300);
        Button buc3 = new Button("3");
        buc3.setLayoutY(400);
        buc3.setLayoutX(350);
        Button buc4 = new Button("4");
        buc4.setLayoutY(450);
        buc4.setLayoutX(250);
        Button buc5 = new Button("5");
        buc5.setLayoutY(450);
        buc5.setLayoutX(300);
        Button buc6 = new Button("6");
        buc6.setLayoutY(450);
        buc6.setLayoutX(350);
        Button buc7 = new Button("7");
        buc7.setLayoutY(500);
        buc7.setLayoutX(250);
        Button buc8 = new Button("8");
        buc8.setLayoutY(500);
        buc8.setLayoutX(300);
        Button buc9 = new Button("9");
        buc9.setLayoutY(500);
        buc9.setLayoutX(350);
        Button buc0 = new Button("0");
        buc0.setLayoutY(550);
        buc0.setLayoutX(250);
        Button buc10 = new Button(".");
        buc10.setLayoutY(550);
        buc10.setLayoutX(300);
        Button buc11 = new Button("-");
        buc11.setLayoutY(550);
        buc11.setLayoutX(350);
        //set event for button in compound interest
        buc1.setOnAction(event -> {
            textField.appendText("1");
        });
        buc2.setOnAction(event -> {
            textField.appendText("2");
        });
        buc3.setOnAction(event -> {
            textField.appendText("3");
        });
        buc4.setOnAction(event -> {
            textField.appendText("4");
        });
        buc5.setOnAction(event -> {
            textField.appendText("5");
        });
        buc6.setOnAction(event -> {
            textField.appendText("6");
        });
        buc7.setOnAction(event -> {
            textField.appendText("7");
        });
        buc8.setOnAction(event -> {
            textField.appendText("8");
        });
        buc9.setOnAction(event -> {
            textField.appendText("9");
        });
        buc0.setOnAction(event -> {
            textField.appendText("0");
        });
        buc10.setOnAction(event -> {
            textField.appendText(".");
        });
        buc11.setOnAction(event -> {
            textField.appendText("-");
        });

        //create button and find the value of A event
        Button calculator_future_value = new Button("Calculator for future value");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_future_value.setLayoutX(400);
        calculator_future_value.setLayoutY(300);
        calculator_future_value.setOnAction(event -> {


            double P = Double.parseDouble(txtc1.getText());
            double r = Double.parseDouble(txtc2.getText());
            double t = Double.parseDouble(txtc3.getText());
            double n = Double.parseDouble(txtc4.getText());

            double A;
            A = P * Math.pow((1 + r / n), n * t);
            txtc5.setText(String.valueOf(A));

        });
        //create button and find the value of P event
        Button calculator_present_value = new Button("Calculate the present value");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_present_value.setLayoutX(400);
        calculator_present_value.setLayoutY(100);
        calculator_present_value.setOnAction(event -> {

            double A = Double.parseDouble(txtc5.getText());
            double r = Double.parseDouble(txtc2.getText());
            double t = Double.parseDouble(txtc3.getText());
            double n = Double.parseDouble(txtc4.getText());



            double P;
            P=A/Math.pow((1+r/n),n*t);
            txtc1.setText(String.valueOf(P));

        });

        //create button and find the value of r event
        Button calculator_interest_rate = new Button("Calculate the interest rate");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_interest_rate.setLayoutX(400);
        calculator_interest_rate.setLayoutY(150);
        calculator_interest_rate.setOnAction(event -> {

            double A = Double.parseDouble(txtc5.getText());
            double P = Double.parseDouble(txtc1.getText());
            double t = Double.parseDouble(txtc3.getText());
            double n = Double.parseDouble(txtc4.getText());



            double r;
            r=n*Math.pow((A/P)*1/n*t,-1);
            txtc2.setText(String.valueOf(r));


        });
        //create button and find the value of t event
        Button calculator_time_in_a_year = new Button("Calculate Time in a Year");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_time_in_a_year.setLayoutX(400);
        calculator_time_in_a_year.setLayoutY(200);
        calculator_time_in_a_year.setOnAction(event -> {

            double A = Double.parseDouble(txtc5.getText());
            double P = Double.parseDouble(txtc1.getText());
            double r = Double.parseDouble(txtc2.getText());
            double n = Double.parseDouble(txtc4.getText());



            double t;
            t=Math.log(A/P)/n*Math.log(1+r/n);
            txtc3.setText(String.valueOf(t));


        });



        //create back button
        Button buttonc = new Button("Back");
        buttonc.setOnAction(e -> window.setScene(s1));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        buttonc.setLayoutX(150);
        buttonc.setLayoutY(450);


        //holding
        Pane rootc = new Pane();
        rootc.getChildren().add(calculator_future_value);
        rootc.getChildren().add(lbc1);
        rootc.getChildren().add(calculator_interest_rate);
        rootc.getChildren().add(calculator_present_value);
        rootc.getChildren().add(calculator_time_in_a_year);
        rootc.getChildren().add(lbc2);
        rootc.getChildren().add(lbc3);
        rootc.getChildren().add(lbc4);
        rootc.getChildren().add(lbc5);
        rootc.getChildren().add(txtc1);
        rootc.getChildren().add(txtc2);
        rootc.getChildren().add(txtc3);
        rootc.getChildren().add(txtc4);
        rootc.getChildren().add(txtc5);
        rootc.getChildren().add(buttonc);
        rootc.getChildren().add(buc0);
        rootc.getChildren().add(buc1);
        rootc.getChildren().add(buc2);
        rootc.getChildren().add(buc3);
        rootc.getChildren().add(buc4);
        rootc.getChildren().add(buc5);
        rootc.getChildren().add(buc6);
        rootc.getChildren().add(buc7);
        rootc.getChildren().add(buc8);
        rootc.getChildren().add(buc9);
        rootc.getChildren().add(buc10);
        rootc.getChildren().add(buc11);





        primaryStage.setScene(new Scene(rootc, 300, 250));
        primaryStage.show();

//Savings
        primaryStage.setTitle("Savings");
        // lables
        Label lbs1 = new Label("Time in Year");
        lbs1.setLayoutY(100);
        lbs1.setLayoutX(50);
        Label lbs2 = new Label("No of Months");
        lbs2.setLayoutY(150);
        lbs2.setLayoutX(50);
        Label lbs3 = new Label("Interest Rate");
        lbs3.setLayoutY(200);
        lbs3.setLayoutX(50);
        Label lbs4 = new Label("Payment");
        lbs4.setLayoutY(250);
        lbs4.setLayoutX(50);
        Label lbs5 = new Label("Future Value");
        lbs5.setLayoutY(300);
        lbs5.setLayoutX(50);


        //textfield
        TextField txts1 = new TextField();
        txts1.setLayoutX(150);
        txts1.setLayoutY(100);
        TextField txts2 = new TextField();
        txts2.setLayoutX(150);
        txts2.setLayoutY(150);
        TextField txts3 = new TextField();
        txts3.setLayoutX(150);
        txts3.setLayoutY(200);
        TextField txts4 = new TextField();
        txts4.setLayoutX(150);
        txts4.setLayoutY(250);
        TextField txts5 = new TextField();
        txts5.setLayoutX(150);
        txts5.setLayoutY(300);

        //textfield function
        txts1.setOnMouseClicked(event -> {
            textField = txts1;
        });
        txts2.setOnMouseClicked(event -> {
            textField = txts2;
        });
        txts3.setOnMouseClicked(event -> {
            textField = txts3;
        });
        txts4.setOnMouseClicked(event -> {
            textField = txts4;
        });
        txts5.setOnMouseClicked(event -> {
            textField = txts5;
        });
        //calculator button
        Button bus1 = new Button("1");

        bus1.setLayoutY(400);
        bus1.setLayoutX(250);
        Button bus2 = new Button("2");

        bus2.setLayoutY(400);
        bus2.setLayoutX(300);
        Button bus3 = new Button("3");

        bus3.setLayoutY(400);
        bus3.setLayoutX(350);
        Button bus4 = new Button("4");

        bus4.setLayoutY(450);
        bus4.setLayoutX(250);
        Button bus5 = new Button("5");

        bus5.setLayoutY(450);
        bus5.setLayoutX(300);
        Button bus6 = new Button("6");

        bus6.setLayoutY(450);
        bus6.setLayoutX(350);
        Button bus7 = new Button("7");

        bus7.setLayoutY(500);
        bus7.setLayoutX(250);
        Button bus8 = new Button("8");

        bus8.setLayoutY(500);
        bus8.setLayoutX(300);
        Button bus9 = new Button("9");

        bus9.setLayoutY(500);
        bus9.setLayoutX(350);
        Button bus0 = new Button("0");

        bus0.setLayoutY(550);
        bus0.setLayoutX(250);
        Button bus10 = new Button(".");

        bus10.setLayoutY(550);
        bus10.setLayoutX(300);
        Button bus11 = new Button("-");

        bus11.setLayoutY(550);
        bus11.setLayoutX(350);
        //calculator button function
        bus1.setOnAction(event -> {
            textField.appendText("1");
        });
        bus2.setOnAction(event -> {
            textField.appendText("2");
        });
        bus3.setOnAction(event -> {
            textField.appendText("3");
        });
        bus4.setOnAction(event -> {
            textField.appendText("4");
        });
        bus5.setOnAction(event -> {
            textField.appendText("5");
        });
        bus6.setOnAction(event -> {
            textField.appendText("6");
        });
        bus7.setOnAction(event -> {
            textField.appendText("7");
        });
        bus8.setOnAction(event -> {
            textField.appendText("8");
        });
        bus9.setOnAction(event -> {
            textField.appendText("9");
        });
        bus0.setOnAction(event -> {
            textField.appendText("0");
        });
        bus10.setOnAction(event -> {
            textField.appendText(".");
        });
        bus11.setOnAction(event -> {
            textField.appendText("-");
        });
        //find the value A
        Button calculator_future_valueS= new Button("Calculate Future value");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_future_valueS.setLayoutX(400);
        calculator_future_valueS.setLayoutY(300);
        calculator_future_valueS.setOnAction(event -> {



            double t = Double.parseDouble(txts1.getText());
            double n = Double.parseDouble(txts2.getText());
            double r = Double.parseDouble(txts3.getText());
            double PMT= Double.parseDouble(txts4.getText());

            double A;
            A = PMT * Math.pow((1+r/n),n*t -1 / r/n);
            txts5.setText(String.valueOf(A));

        });
        //find the value PMT
        Button calculator_payment= new Button("Calculate Payment");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_payment.setLayoutX(400);
        calculator_payment.setLayoutY(250);

        calculator_payment.setOnAction(event -> {

            double t = Double.parseDouble(txts1.getText());
            double n = Double.parseDouble(txts2.getText());
            double r = Double.parseDouble(txts3.getText());
            double A= Double.parseDouble(txts5.getText());

            double PMT;
            PMT= A/Math.pow((1+r/n),n*t-1/r/n);
            txts4.setText(String.valueOf(PMT));

        });
        //find the value t
        Button calculator_time_in_year= new Button("Calculate time in year");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_time_in_year.setLayoutX(400);
        calculator_time_in_year.setLayoutY(100);

        calculator_time_in_year.setOnAction(event -> {

            double PMT = Double.parseDouble(txts4.getText());
            //double n = Double.parseDouble(txts2.getText());
            // double n=12;
            double r = Double.parseDouble(txts3.getText());
            double A= Double.parseDouble(txts5.getText());

            double t;
            t= Math.log((1+r*A/PMT)) / Math.log((1+r)*12);
            txts1.setText(String.valueOf(t));
            System.out.print("Success"+t);

        });
        //back button
        Button buttons = new Button("Back");
        buttons.setOnAction(e -> window.setScene(s1));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        buttons.setLayoutX(150);
        buttons.setLayoutY(450);

        //holding
        Pane roots = new Pane();
        roots.getChildren().add(calculator_time_in_year);
        roots.getChildren().add(calculator_future_valueS);
        roots.getChildren().add(calculator_payment);
        roots.getChildren().add(lbs1);
        roots.getChildren().add(lbs2);
        roots.getChildren().add(lbs3);
        roots.getChildren().add(lbs4);
        roots.getChildren().add(lbs5);
        roots.getChildren().add(txts1);
        roots.getChildren().add(txts2);
        roots.getChildren().add(txts3);
        roots.getChildren().add(txts4);
        roots.getChildren().add(txts5);
        roots.getChildren().add(buttons);
        roots.getChildren().add(bus0);
        roots.getChildren().add(bus1);
        roots.getChildren().add(bus2);
        roots.getChildren().add(bus3);
        roots.getChildren().add(bus4);
        roots.getChildren().add(bus5);
        roots.getChildren().add(bus6);
        roots.getChildren().add(bus7);
        roots.getChildren().add(bus8);
        roots.getChildren().add(bus9);
        roots.getChildren().add(bus10);
        roots.getChildren().add(bus11);



        primaryStage.setScene(new Scene(roots, 300, 250));
        primaryStage.show();



        //Loans

        primaryStage.setTitle("Loans");
        //lables
        Label lbl1 = new Label("Loan Amount");
        lbl1.setLayoutY(100);
        lbl1.setLayoutX(50);
        Label lbl2 = new Label("Monthly Payment");
        lbl2.setLayoutY(150);
        lbl2.setLayoutX(50);
        Label lbl3 = new Label("Interest Rate");
        lbl3.setLayoutY(200);
        lbl3.setLayoutX(50);
        Label lbl4 = new Label("Number of Months");
        lbl4.setLayoutY(250);
        lbl4.setLayoutX(50);

        //textfield
        TextField txtl1 = new TextField();
        txtl1.setLayoutX(250);
        txtl1.setLayoutY(100);
        TextField txtl2 = new TextField();
        txtl2.setLayoutX(250);
        txtl2.setLayoutY(150);
        TextField txtl3 = new TextField();
        txtl3.setLayoutX(250);
        txtl3.setLayoutY(200);
        TextField txtl4 = new TextField();
        txtl4.setLayoutX(250);
        txtl4.setLayoutY(250);
        TextField txtl5 = new TextField();
        txtl5.setLayoutX(250);
        txtl5.setLayoutY(300);

        //textfield function

        txtl1.setOnMouseClicked(event -> {
            textField = txtl1;
        });
        txtl2.setOnMouseClicked(event -> {
            textField = txtl2;
        });
        txtl3.setOnMouseClicked(event -> {
            textField = txtl3;
        });
        txtl4.setOnMouseClicked(event -> {
            textField = txtl4;
        });
        txtl5.setOnMouseClicked(event -> {
            textField = txtl5;
        });

        //calculator button
        Button bul1 = new Button("1");

        bul1.setLayoutY(400);
        bul1.setLayoutX(250);
        Button bul2 = new Button("2");

        bul2.setLayoutY(400);
        bul2.setLayoutX(300);
        Button bul3 = new Button("3");

        bul3.setLayoutY(400);
        bul3.setLayoutX(350);
        Button bul4 = new Button("4");

        bul4.setLayoutY(450);
        bul4.setLayoutX(250);
        Button bul5 = new Button("5");

        bul5.setLayoutY(450);
        bul5.setLayoutX(300);
        Button bul6 = new Button("6");

        bul6.setLayoutY(450);
        bul6.setLayoutX(350);
        Button bul7 = new Button("7");

        bul7.setLayoutY(500);
        bul7.setLayoutX(250);
        Button bul8 = new Button("8");

        bul8.setLayoutY(500);
        bul8.setLayoutX(300);
        Button bul9 = new Button("9");

        bul9.setLayoutY(500);
        bul9.setLayoutX(350);
        Button bul0 = new Button("0");

        bul0.setLayoutY(550);
        bul0.setLayoutX(250);
        Button bul10 = new Button(".");

        bul10.setLayoutY(550);
        bul10.setLayoutX(300);
        Button bul11 = new Button("-");

        bul11.setLayoutY(550);
        bul11.setLayoutX(350);

        //calculator button function

        bul1.setOnAction(event -> {
            textField.appendText("1");
        });
        bul2.setOnAction(event -> {
            textField.appendText("2");
        });
        bul3.setOnAction(event -> {
            textField.appendText("3");
        });
        bul4.setOnAction(event -> {
            textField.appendText("4");
        });
        bul5.setOnAction(event -> {
            textField.appendText("5");
        });
        bul6.setOnAction(event -> {
            textField.appendText("6");
        });
        bul7.setOnAction(event -> {
            textField.appendText("7");
        });
        bul8.setOnAction(event -> {
            textField.appendText("8");
        });
        bul9.setOnAction(event -> {
            textField.appendText("9");
        });
        bul0.setOnAction(event -> {
            textField.appendText("0");
        });
        bul10.setOnAction(event -> {
            textField.appendText(".");
        });
        bul11.setOnAction(event -> {
            textField.appendText("-");
        });

        //find the value PV
        Button calculator_loan_amount= new Button("Calculate Loan Amount");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_loan_amount.setLayoutX(450);
        calculator_loan_amount.setLayoutY(100);
        calculator_loan_amount.setOnAction(event -> {


            double n = Double.parseDouble(txtl4.getText());
            double r = Double.parseDouble(txtl3.getText());
            double PMT= Double.parseDouble(txtl2.getText());

            double PV;

            PV=PMT/r * (1 - (1 /Math.pow((1+r),n)));
            NumberFormat pv= NumberFormat.getInstance();

            txtl1.setText(String.valueOf(pv.format(PV)));

        });

        //back button
        Button buttonl = new Button("Back");
        buttonl.setOnAction(e -> window.setScene(s1));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        buttonl.setLayoutX(150);
        buttonl.setLayoutY(450);


        //holding
        Pane rootl = new Pane();
        rootl.getChildren().add(calculator_loan_amount);
        rootl.getChildren().add(lbl1);
        rootl.getChildren().add(lbl2);
        rootl.getChildren().add(lbl3);
        rootl.getChildren().add(lbl4);
        rootl.getChildren().add(txtl1);
        rootl.getChildren().add(txtl2);
        rootl.getChildren().add(txtl3);
        rootl.getChildren().add(txtl4);
        rootl.getChildren().add(buttonl);
        rootl.getChildren().add(bul0);
        rootl.getChildren().add(bul1);
        rootl.getChildren().add(bul2);
        rootl.getChildren().add(bul3);
        rootl.getChildren().add(bul4);
        rootl.getChildren().add(bul5);
        rootl.getChildren().add(bul6);
        rootl.getChildren().add(bul7);
        rootl.getChildren().add(bul8);
        rootl.getChildren().add(bul9);
        rootl.getChildren().add(bul10);
        rootl.getChildren().add(bul11);


        primaryStage.setScene(new Scene(rootl, 300, 250));
        primaryStage.show();




        //Mortgage

        primaryStage.setTitle("Mortgage");
        //lables
        Label lbm1 = new Label("Future rate");
        lbm1.setLayoutY(100);
        lbm1.setLayoutX(50);
        Label lbm2 = new Label("Interest rate");
        lbm2.setLayoutY(150);
        lbm2.setLayoutX(50);
        Label lbm3 = new Label("Time in year");
        lbm3.setLayoutY(200);
        lbm3.setLayoutX(50);
        Label lbm4 = new Label("Payment");
        lbm4.setLayoutY(250);
        lbm4.setLayoutX(50);

        //textfield
        TextField txtm1 = new TextField();
        txtm1.setLayoutX(150);
        txtm1.setLayoutY(100);
        TextField txtm2 = new TextField();
        txtm2.setLayoutX(150);
        txtm2.setLayoutY(150);
        TextField txtm3 = new TextField();
        txtm3.setLayoutX(150);
        txtm3.setLayoutY(200);
        TextField txtm4 = new TextField();
        txtm4.setLayoutX(150);
        txtm4.setLayoutY(250);

        //textfield function
        txtm1.setOnMouseClicked(event -> {
            textField = txtm1;
        });
        txtm2.setOnMouseClicked(event -> {
            textField = txtm2;
        });
        txtm3.setOnMouseClicked(event -> {
            textField = txtm3;
        });
        txtm4.setOnMouseClicked(event -> {
            textField = txtm4;
        });


        //calculator button
        Button bum1 = new Button("1");

        bum1.setLayoutY(400);
        bum1.setLayoutX(250);
        Button bum2 = new Button("2");

        bum2.setLayoutY(400);
        bum2.setLayoutX(300);
        Button bum3 = new Button("3");

        bum3.setLayoutY(400);
        bum3.setLayoutX(350);
        Button bum4 = new Button("4");

        bum4.setLayoutY(450);
        bum4.setLayoutX(250);
        Button bum5 = new Button("5");

        bum5.setLayoutY(450);
        bum5.setLayoutX(300);
        Button bum6 = new Button("6");

        bum6.setLayoutY(450);
        bum6.setLayoutX(350);
        Button bum7 = new Button("7");

        bum7.setLayoutY(500);
        bum7.setLayoutX(250);
        Button bum8 = new Button("8");

        bum8.setLayoutY(500);
        bum8.setLayoutX(300);
        Button bum9 = new Button("9");

        bum9.setLayoutY(500);
        bum9.setLayoutX(350);
        Button bum0 = new Button("0");

        bum0.setLayoutY(550);
        bum0.setLayoutX(250);
        Button bum10 = new Button(".");

        bum10.setLayoutY(550);
        bum10.setLayoutX(300);
        Button bum11 = new Button("-");

        bum11.setLayoutY(550);
        bum11.setLayoutX(350);

        //calculator button function

        bum1.setOnAction(event -> {
            textField.appendText("1");
        });
        bum2.setOnAction(event -> {
            textField.appendText("2");
        });
        bum3.setOnAction(event -> {
            textField.appendText("3");
        });
        bum4.setOnAction(event -> {
            textField.appendText("4");
        });
        bum5.setOnAction(event -> {
            textField.appendText("5");
        });
        bum6.setOnAction(event -> {
            textField.appendText("6");
        });
        bum7.setOnAction(event -> {
            textField.appendText("7");
        });
        bum8.setOnAction(event -> {
            textField.appendText("8");
        });
        bum9.setOnAction(event -> {
            textField.appendText("9");
        });
        bum0.setOnAction(event -> {
            textField.appendText("0");
        });
        bum10.setOnAction(event -> {
            textField.appendText(".");
        });
        bum11.setOnAction(event -> {
            textField.appendText("-");
        });

        //find the value PMT
        Button calculator_paymentM= new Button("Calculate the payment");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_paymentM.setLayoutX(400);
        calculator_paymentM.setLayoutY(250);
        calculator_paymentM.setOnAction(event -> {


            double n=12;
            double t = Double.parseDouble(txtm3.getText());
            double r = Double.parseDouble(txtm2.getText());
            double A= Double.parseDouble(txtm1.getText());

            double PMT;
            PMT = A*r/12*Math.pow((1+r/12),12*t);

            txtm4.setText(String.valueOf(PMT));

        });

        //find the value t
        Button calculator_time_in_yearM= new Button("Calculate time in year");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        calculator_time_in_yearM.setLayoutX(400);
        calculator_time_in_yearM.setLayoutY(200);

        calculator_time_in_yearM.setOnAction(event -> {


            double n=12;
            double PMT = Double.parseDouble(txtm4.getText());
            double r = Double.parseDouble(txtm2.getText());
            double A= Double.parseDouble(txtm1.getText());

            double t;
            t =Math.log(((1-((r*A)/PMT)))/Math.log(1+r)*12);
            txtm3.setText(String.valueOf(t));

        });

        //back button
        Button buttonm = new Button("Back");
        buttonm.setOnAction(e -> window.setScene(s1));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        buttonm.setLayoutX(150);
        buttonm.setLayoutY(450);


        //holding
        Pane rootm = new Pane();
        rootm.getChildren().add(calculator_time_in_yearM);
        rootm.getChildren().add(calculator_paymentM);
        rootm.getChildren().add(lbm1);
        rootm.getChildren().add(lbm2);
        rootm.getChildren().add(lbm3);
        rootm.getChildren().add(lbm4);
        rootm.getChildren().add(txtm1);
        rootm.getChildren().add(txtm2);
        rootm.getChildren().add(txtm3);
        rootm.getChildren().add(txtm4);
        rootm.getChildren().add(buttonm);
        rootm.getChildren().add(bum0);
        rootm.getChildren().add(bum1);
        rootm.getChildren().add(bum2);
        rootm.getChildren().add(bum3);
        rootm.getChildren().add(bum4);
        rootm.getChildren().add(bum5);
        rootm.getChildren().add(bum6);
        rootm.getChildren().add(bum7);
        rootm.getChildren().add(bum8);
        rootm.getChildren().add(bum9);
        rootm.getChildren().add(bum10);
        rootm.getChildren().add(bum11);


        primaryStage.setScene(new Scene(rootm, 300, 250));
        primaryStage.show();


        // Help
        // create the text object
        Text texth = new Text();
        //add text
        texth.setText("This finance calculator have four sub calculator there are compound interest, savings, loans, mortgage" +"\n"+
                "The first one is compound interest and this calculator have five varibles P,r,t,n,A" +"\n"+
                "P = Present value" +"\n"+
                "r = Interest rate" +"\n"+
                "t = Time in year" +"\n"+
                "n = Number of months" +"\n"+
                "A = Future value"+ "Then savings calculator it is additionally have a PMT but not have a P" +"\n" +
                "PMT = Payment" +"\n"+"Next one loans calculator it is additionally have a PV but not have P,A,t" +"\n"+
                "PV = Loan amount" +"\n"+
                "The last one is mortgage calculator it is have at the same thing for t,r,A,PMT"
        );
        //set position
        texth.setX(50);
        texth.setY(50);

        primaryStage.setTitle("Help");

        Button buttonh = new Button("Back");
        buttonh.setOnAction(e -> window.setScene(s1));
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        buttonh.setLayoutX(150);
        buttonh.setLayoutY(450);


        Pane rooth = new Pane();
        rooth.getChildren().add(buttonh);
        rooth.getChildren().add(texth);

        primaryStage.setScene(new Scene(rooth,300,250));
        primaryStage.show();





        //home page buttons

        Button b1 = new Button("Compound Interest ");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        b1.setOnAction(e -> window.setScene(s2));
        b1.setLayoutX(150);
        b1.setLayoutY(100);


        Button b2 = new Button(" Savings ");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        b2.setOnAction(e -> window.setScene(s3));
        b2.setLayoutX(150);
        b2.setLayoutY(150);


        Button b3 = new Button("Loans");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        b3.setOnAction(e -> window.setScene(s4));
        b3.setLayoutX(150);
        b3.setLayoutY(200);


        Button b4 = new Button("Mortgage");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        b4.setOnAction(e -> window.setScene(s5));
        b4.setLayoutX(150);
        b4.setLayoutY(250);


        Button bH = new Button("Help");
        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        bH.setOnAction(e -> window.setScene(sH));
        bH.setLayoutX(150);
        bH.setLayoutY(300);

        //holding
        Pane mainRoot = new Pane();
        mainRoot.getChildren().add(b1);
        mainRoot.getChildren().add(b2);
        mainRoot.getChildren().add(b3);
        mainRoot.getChildren().add(b4);
        mainRoot.getChildren().add(bH);




        primaryStage.setScene(new Scene(mainRoot, 300, 250));
        primaryStage.show();


        //set layouts
        VBox layout1 = new VBox();
        layout1.getChildren().addAll(mainRoot);
        s1 = new Scene(layout1,350,200,Color.PEACHPUFF);


        VBox layout2= new VBox();
        layout2.getChildren().addAll(rootc);
        s2 = new Scene(layout2,350,200,Color.OLIVEDRAB);

        VBox layout3= new VBox();
        layout3.getChildren().addAll(roots);
        s3 = new Scene(layout3,350,200,Color.DARKGREY);

        VBox layout4= new VBox();
        layout4.getChildren().addAll(rootl);
        s4 = new Scene(layout4,350,200,Color.IVORY);

        VBox layout5= new VBox();
        layout5.getChildren().addAll(rootm);
        s5 = new Scene(layout5,350,200,Color.AZURE);


        VBox layout6= new VBox();
        layout6.getChildren().addAll(rooth);
        sH = new Scene(layout6,350,200,Color.AQUA);




        window.setScene(s1);
        window.setTitle("Finance Calculator");
        window.show();


    }

    private void btncode(ActionEvent e) {
    }


    private double log() {
        return 0;
    }


}
