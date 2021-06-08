
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fahee
 */
public class calculate {
    
    private double num1;
    private double num2;
    
    private String CurrOperation;
    
    private JLabel label1;
    private JLabel label2;
    
    public void InitializeCal(){
        
      JFrame frame = new JFrame();
      frame.setTitle("Calculator");
      frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      frame.setSize(300, 500);
      frame.setMinimumSize(new Dimension(225,210));
      
      
      JPanel panel1 = new JPanel();
      
            
      GridLayout layout1 = new GridLayout(2,1);
      panel1.setLayout(layout1);
      panel1.setBounds(0, 0, 200, 50);
      label1 = new JLabel();
      
      panel1.add(label1);
      
      
      label1.setBackground(Color.white);
      label1.setFont(new Font("Arial", Font.PLAIN, 40));
      label1.setHorizontalAlignment(SwingConstants.RIGHT);
            
            
      label2 = new JLabel();
      panel1.add(label2);
      label2.setBackground(Color.white);
      label2.setFont(new Font("Arial", Font.PLAIN, 20));
      label2.setHorizontalAlignment(SwingConstants.RIGHT);
      
      JPanel panel = new JPanel();
      panel.setBounds(0, 0, 200, 400);
      GridLayout layout = new GridLayout(6,4);
      panel.setLayout(layout);
      
      JButton ButtonPercen=new JButton("%");
      ButtonPercen.setBackground(Color.white);
      ButtonPercen.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonPercen.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("%");
    }
});
      
      JButton ButtonSqrt=new JButton("√");
            ButtonSqrt.setBackground(Color.white);
            ButtonSqrt.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonSqrt.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("√");
    }
});
      
      JButton ButtonSqr=new JButton("x2");
      ButtonSqr.setBackground(Color.white);
      ButtonSqr.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonSqr.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("x2");
    }
});
      
      JButton ButtonInverse=new JButton("1/x");
      ButtonInverse.setBackground(Color.white);
      ButtonInverse.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonInverse.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("1/x");
    }
});
      
      JButton ButtonCE=new JButton("CE");
      ButtonCE.setBackground(Color.white);
      ButtonCE.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonCE.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("CE");
    }
});
      JButton ButtonC=new JButton("C");
      ButtonC.setBackground(Color.white);
      ButtonC.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonC.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("C");
    }
});
      JButton ButtonBack=new JButton("⌫");
      ButtonBack.setBackground(Color.white);
     // ButtonBack.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonBack.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("⌫");
    }
});
      
      JButton ButtonDiv=new JButton("÷");
      ButtonDiv.setBackground(Color.white);
      ButtonDiv.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonDiv.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("÷");
    }
});
      
      JButton Button7=new JButton("7");
      Button7.setBackground(Color.BLACK);
      Button7.setForeground(Color.white);
      Button7.setFont(new Font("Arial", Font.PLAIN, 30));
      
      Button7.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(7);
    }
});
      JButton Button8=new JButton("8");
      Button8.setBackground(Color.BLACK);
      Button8.setForeground(Color.white);
      Button8.setFont(new Font("Arial", Font.PLAIN, 30));
      Button8.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(8);
    }
});
      JButton Button9=new JButton("9");
      Button9.setBackground(Color.BLACK);
      Button9.setForeground(Color.white);
      Button9.setFont(new Font("Arial", Font.PLAIN, 30));
      Button9.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(9);
    }
});
      JButton ButtonMul=new JButton("x");
      ButtonMul.setBackground(Color.white);
      ButtonMul.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonMul.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("x");
    }
});
      
      JButton Button4=new JButton("4");
      Button4.setBackground(Color.BLACK);
      Button4.setForeground(Color.white);
      Button4.setFont(new Font("Arial", Font.PLAIN, 30));
      Button4.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(4);
    }
});
      JButton Button5=new JButton("5");
      Button5.setBackground(Color.BLACK);
      Button5.setForeground(Color.white);
      Button5.setFont(new Font("Arial", Font.PLAIN, 30));
      Button5.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(5);
    }
});
      JButton Button6=new JButton("6");
      Button6.setBackground(Color.BLACK);
      Button6.setForeground(Color.white);
      Button6.setFont(new Font("Arial", Font.PLAIN, 30));
      Button6.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(6);
    }
});
      JButton ButtonSub=new JButton("-");
      ButtonSub.setBackground(Color.white);
      ButtonSub.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonSub.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("-");
    }
});
      
      JButton Button1=new JButton("1");
      Button1.setBackground(Color.BLACK);
      Button1.setForeground(Color.white);
      Button1.setFont(new Font("Arial", Font.PLAIN, 30));
      Button1.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(1);
    }
});
      JButton Button2=new JButton("2");
      Button2.setBackground(Color.BLACK);
      Button2.setForeground(Color.white);
      Button2.setFont(new Font("Arial", Font.PLAIN, 30));
      Button2.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(2);
    }
});
      JButton Button3=new JButton("3");
      Button3.setBackground(Color.BLACK);
      Button3.setForeground(Color.white);
      Button3.setFont(new Font("Arial", Font.PLAIN, 30));
      Button3.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(3);
    }
});
      JButton ButtonAdd=new JButton("+");
      ButtonAdd.setBackground(Color.white);
      ButtonAdd.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonAdd.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("+");
    }
});
      
      JButton ButtonFlip=new JButton("+/-");
      ButtonFlip.setBackground(Color.white);
      ButtonFlip.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonFlip.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("/");
    }
});
      
      JButton Button0=new JButton("0");
      Button0.setBackground(Color.BLACK);
      Button0.setForeground(Color.white);
      Button0.setFont(new Font("Arial", Font.PLAIN, 30));
      Button0.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        UpdateText(0);
    }
});
      JButton ButtonDot=new JButton(".");
      ButtonDot.setBackground(Color.white);
      ButtonDot.setFont(new Font("Arial", Font.PLAIN, 30));
      ButtonDot.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation(".");
    }
});
      
      JButton ButtonEqual=new JButton("=");
      ButtonEqual.setBackground(Color.white);
      ButtonEqual.setFont(new Font("Arial", Font.PLAIN, 20));
      ButtonEqual.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
        //your actions
        Calculation("=");
    }
});
      
      
      panel.add(ButtonPercen);
      panel.add(ButtonSqrt);
      panel.add(ButtonSqr);
      panel.add(ButtonInverse);
      panel.add(ButtonCE);
      panel.add(ButtonC);
      panel.add(ButtonBack);
      panel.add(ButtonDiv);
      panel.add(Button7);
      panel.add(Button8);
      panel.add(Button9);
      panel.add(ButtonMul);
      panel.add(Button4);
      panel.add(Button5);
      panel.add(Button6);
      panel.add(ButtonSub);
      panel.add(Button1);
      panel.add(Button2);
      panel.add(Button3);
      panel.add(ButtonAdd);
      panel.add(ButtonFlip);
      panel.add(Button0);
      panel.add(ButtonDot);
      panel.add(ButtonEqual);
      
      JPanel panel2 = new JPanel();
      GridLayout layout2 = new GridLayout(2,1);
      panel2.setLayout(layout2);
      
      panel2.add(panel1);
      panel2.add(panel);
      
      frame.add(panel2);
      frame.setVisible(true);
    }
    
    
    public calculate() {  
        num1=0;
        CurrOperation="";
    }
    
    public void UpdateText(int n){
        
        
        num1=num1*10;
        num1=num1+n;
        
        label1.setText(Integer.toString((int)num1));
    }
    
    public void UpdateVals(){
        label1.setText(Integer.toString((int)num1));
        label2.setText(Integer.toString((int)num2));
    }
    
    public void PerformCalculation(){
        //if(str1.equals("")==false){
        if(CurrOperation.equals("+")){
            num2=num2+num1;
        }
        else if(CurrOperation.equals("-")){
            num2=num2-num1;
        }
        else if(CurrOperation.equals("x")){
            num2=num2*num1;
        }
        else if(CurrOperation.equals("÷")){
            num2=num2/num1;
        }
        }

    public void HandleEqual(){
        
        if(num1==0){
            num1=num2;
        }
        double temp=num2;
        
        if(CurrOperation.equals("+")){
            num2=num2+num1;
        }
        else if(CurrOperation.equals("-")){
            num2=num2-num1;
        }
        else if(CurrOperation.equals("x")){
            num2=num2*num1;
        }
        else if(CurrOperation.equals("÷")){
            num2=num2/num1;
        }
        
        label1.setText(Double.toString(num2));
        label2.setText(Double.toString(temp)+CurrOperation+Double.toString(num1)+"=");
        num1=num2;
        CurrOperation="";
    }
    
    public void update2(String str){
        num1=0;
        CurrOperation=str;
        label1.setText(Double.toString(num1));
        label2.setText(Double.toString(num2)+str);
    }
    
    //Initial
    public void update1(String str){
        CurrOperation=str;
        num2=num1;
        num1=0;
        label1.setText(Double.toString(num1));
        label2.setText(Double.toString(num2)+str);
    }
    
    public void Calculation(String str){
        switch (str) {
            case "C":
                num1=0;
                UpdateVals();
                break;
            case "CE":
                num1=0;
                num2=0;
                UpdateVals();
                break;
            case "+":
                if(CurrOperation.equals("")==false){ //maybe it is second + operation in row
                    PerformCalculation();
                    update2("+");
                }
                else{ 
                    update1("+");
                }   
                break;
            case "-":
                if(CurrOperation.equals("")==false){
                    PerformCalculation();
                    update2("-");
                }
                else{
                    update1("-");
                }   
                break;
            case "%":
                num1=num1/100;
                label1.setText(Double.toString(num1));
                break;
            case "√":
                double temp=num1;
                num1=Math.sqrt(num1);
                label1.setText(Double.toString(num1));
                label2.setText("sqrt("+temp+")");
                break;
            case "x2":
                temp=num1;
                num1=num1*num1;
                label1.setText(Double.toString(num1));
                label2.setText("sqr("+temp+")");
                break;
            case "1/x":
                temp=num1;
                num1=1/num1;
                label1.setText(Double.toString(num1));
                label2.setText("1/"+temp);
                break;
            case "÷":
                if(CurrOperation.equals("")==false){
                    PerformCalculation();
                    update2("÷");
                }
                else{
                    update1("÷");
                }   
                break;
            case "⌫":
                num1=num1-(num1%10);
                num1=num1/10;
                label1.setText(Integer.toString((int)num1));
                break;
            case "x":
                if(!CurrOperation.equals("")){
                    PerformCalculation();
                    update2("x");
                }
                else{
                    update1("x");
                }   break;
            case "/":
                num1=(num1)*(-1.0);
                label1.setText(Double.toString(num1));
                break;
            case ".":
                  label1.setText(Integer.toString((int)num1)+".");
                break;
            case "=":
                if(CurrOperation.equals("")){
                    num2=num1;
                    label1.setText(Double.toString(num1));
                    label2.setText(Double.toString(num2)+"=");
                }else{
                    HandleEqual();
                }
                
                break;
            default:
                break;
        }
        
    }
    
}
