import javax.swing.*;
import java.awt.*;

public class LoginPage extends CustomFrame {
    public LoginPage(String pageTitle) {
        super(pageTitle);

        int pageWidth = getWidth();
        int pageHeight = getHeight();
        setLayout(null);

        // Creating main title label.
        JLabel mainTitle = new JLabel("SKETCH.IO");
        mainTitle.setFont(new Font("Comic Sans MS" , Font.BOLD , pageHeight*11/80));
        mainTitle.setBounds(pageWidth/4 , pageHeight/8 , pageWidth/2 , pageHeight/4);


        // Creating nickName field.
        JTextField nicknameText = new JTextField();
        nicknameText.setBounds(pageWidth*3/8 , pageHeight/2 , pageWidth/4 , pageHeight/16);

        // Creating login button.
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(pageWidth*7/16 , pageHeight*19/32 , pageWidth/8 , pageHeight/16);

        add(nicknameText);
        add(mainTitle);
        add(loginButton);
        setVisible(true);
    }
}