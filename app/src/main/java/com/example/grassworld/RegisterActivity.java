package com.example.grassworld;


import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.EventDispatcher;

public class RegisterActivity extends Form implements HandlesEventDispatching {
    private
    VerticalArrangement AccountLabelArrangement;
    HorizontalArrangement EmailArrangement, PasswordTextboxArrangement, NameArrangement, YOBArrangement, PasswordLabelArrangement;
    Label CreateAccountLabel, NameLabel, PasswordLabel, EmailLabel, YOBLabel;
    TextBox EmailTextBox, NameTextBox, YOBTextBox;
    Button BeginButton;
    PasswordTextBox PasswordTextBox1, PasswordTextBox2;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        AccountLabelArrangement = new VerticalArrangement(this);
        AccountLabelArrangement.HeightPercent(100);
        AccountLabelArrangement.Image("cropped.png");

        CreateAccountLabel = new Label(AccountLabelArrangement);
        CreateAccountLabel.Text("CREATE YOUR OWN ACCOUNT AND REGISTER NOW!!");
        CreateAccountLabel.TextColor(COLOR_BLACK);
        CreateAccountLabel.TextAlignment(ALIGNMENT_CENTER);
        CreateAccountLabel.HeightPercent(20);
        CreateAccountLabel.WidthPercent(100);
        CreateAccountLabel.FontSize(35);
        CreateAccountLabel.FontTypeface(TYPEFACE_SERIF);
        CreateAccountLabel.FontBold(true);
        CreateAccountLabel.FontItalic(true);

        EmailArrangement = new HorizontalArrangement(AccountLabelArrangement);
        
        EmailLabel = new Label(EmailArrangement);
        EmailLabel.Text("Enter valid email:");
        EmailLabel.TextColor(COLOR_BLACK);
        EmailLabel.TextAlignment(ALIGNMENT_NORMAL);
        EmailLabel.HeightPercent(8);
        EmailLabel.WidthPercent(50);
        EmailLabel.FontSize(25);
        EmailLabel.FontTypeface(TYPEFACE_SERIF);
        EmailLabel.FontBold(true);
        EmailLabel.FontItalic(true);

        EmailTextBox = new TextBox(EmailArrangement);
        EmailTextBox.TextAlignment(ALIGNMENT_CENTER);
        EmailTextBox.Text("");
        EmailTextBox.FontSize(25);
        EmailTextBox.HeightPercent(8);
        EmailTextBox.WidthPercent(50);
        EmailTextBox.FontTypeface(TYPEFACE_SERIF);

        NameArrangement = new HorizontalArrangement(AccountLabelArrangement);
        
        NameLabel = new Label(NameArrangement);
        NameLabel.Text("Enter name:");
        NameLabel.TextAlignment(Component.ALIGNMENT_CENTER);
        NameLabel.TextColor(COLOR_BLACK);
        NameLabel.FontSize(25);
        NameLabel.HeightPercent(8);
        NameLabel.WidthPercent(50);
        NameLabel.FontTypeface(TYPEFACE_SERIF);
        NameLabel.FontBold(true);
        NameLabel.FontItalic(true);
       
        NameTextBox = new TextBox(NameArrangement);
        NameTextBox.TextAlignment(ALIGNMENT_CENTER);
        NameTextBox.Text("");
        NameTextBox.FontSize(25);
        NameTextBox.HeightPercent(8);
        NameTextBox.WidthPercent(50);
        NameTextBox.FontTypeface(TYPEFACE_SERIF);

        YOBArrangement = new HorizontalArrangement(AccountLabelArrangement);

        YOBLabel = new Label(YOBArrangement);
        YOBLabel.Text("Enter year of birth:");
        YOBLabel.TextColor(COLOR_BLACK);
        YOBLabel.TextAlignment(ALIGNMENT_CENTER);
        YOBLabel.HeightPercent(8);
        YOBLabel.WidthPercent(50);
        YOBLabel.FontSize(25);
        YOBLabel.FontTypeface(TYPEFACE_SERIF);
        YOBLabel.FontItalic(true);
        YOBLabel.FontBold(true);

        YOBTextBox = new TextBox(YOBArrangement);
        YOBTextBox.TextAlignment(ALIGNMENT_CENTER);
        YOBTextBox.Text("");
        YOBTextBox.FontSize(25);
        YOBTextBox.HeightPercent(8);
        YOBTextBox.WidthPercent(50);
        YOBTextBox.FontTypeface(TYPEFACE_SERIF);
        YOBTextBox.NumbersOnly(true);

        PasswordLabelArrangement = new HorizontalArrangement(AccountLabelArrangement);

       PasswordLabel = new Label(PasswordLabelArrangement);
        PasswordLabel.Text("Enter password and retype to confirm:");
        PasswordLabel.TextColor(COLOR_BLACK);
        PasswordLabel.TextAlignment(ALIGNMENT_NORMAL);
        PasswordLabel.HeightPercent(14);
       PasswordLabel.WidthPercent(50);
        PasswordLabel.FontSize(25);
        PasswordLabel.FontTypeface(TYPEFACE_SERIF);
        PasswordLabel.FontItalic(true);
        PasswordLabel.FontBold(true);

        PasswordTextboxArrangement = new HorizontalArrangement(AccountLabelArrangement);

        PasswordTextBox1 = new PasswordTextBox(PasswordTextboxArrangement);
        PasswordTextBox1.Text("");
        PasswordTextBox1.TextColor(COLOR_BLACK);
        PasswordTextBox1.TextAlignment(ALIGNMENT_CENTER);
        PasswordTextBox1.HeightPercent(8);
        PasswordTextBox1.WidthPercent(50);
        PasswordTextBox1.FontSize(25);
        PasswordTextBox1.FontTypeface(TYPEFACE_SERIF);

        PasswordTextBox2 = new PasswordTextBox(PasswordTextboxArrangement);
        PasswordTextBox2.Text("");
        PasswordTextBox2.TextColor(COLOR_BLACK);
        PasswordTextBox2.TextAlignment(ALIGNMENT_CENTER);
        PasswordTextBox2.HeightPercent(8);
        PasswordTextBox2.WidthPercent(50);
        PasswordTextBox2.FontSize(25);
        PasswordTextBox2.FontTypeface(TYPEFACE_SERIF);

        BeginButton = new Button(AccountLabelArrangement);
        BeginButton.HeightPercent(10);
        BeginButton.WidthPercent(100);
        BeginButton.Text("JOIN GAME!!");
        BeginButton.TextAlignment(ALIGNMENT_CENTER);
        BeginButton.TextColor(COLOR_BLACK);
        BeginButton.FontSize(30);
        BeginButton.BackgroundColor(COLOR_PINK);
        BeginButton.FontTypeface(TYPEFACE_SERIF);
        BeginButton.FontItalic(true);

        EventDispatcher.registerEventForDelegation(this, formName, "Click");
        //EventDispatcher.registerEventForDelegation(this, formName, "Timer");
        //EventDispatcher.registerEventForDelegation(this, formName, "GotText");
        //EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
        //EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
    }
    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params) {

        System.err.print("dispatchEvent: " + formName + " [" + component.toString() + "] [" + componentName + "] " + eventName);
        if (eventName.equals("BackPressed")) {
            // this would be a great place to do something useful
            return true;
        } else if (eventName.equals("Click")) {
            if (component.equals(BeginButton)) {
                switchForm("GamescreenActivity");
            }
        }
        return false;
    }
    public static void dbg (String debugMsg) {
        System.err.print( "~~~> " + debugMsg + " <~~~\n");
    }
}
// Here be monsters:
// put unwanted code here, or experimental code awaiting placement
// https://fachtnaroe.net/qndPasswordLabeldevice=&sensor=CELCIUS