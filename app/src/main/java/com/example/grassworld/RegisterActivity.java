package com.example.grassworld;


import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Web;

import org.json.JSONObject;
import org.json.JSONException;
public class RegisterActivity extends Form implements HandlesEventDispatching {
    private VerticalArrangement PasswordTextBoxArrangementArrangement;
    HorizontalArrangement EmailArrangement, PasswordTextBoxArrangement, NameArrangement, YOBArrangement, PasswordLabelArrangement;
    Label CreateAccountLabel, NameLabel, PasswordLabel, EmailLabel, YOBLabel, LeftArrangementLabel, RightArrangementLabel;
    TextBox EmailTextBox, NameTextBox, YOBTextBox;
    Button BeginButton;
    PasswordTextBox PasswordTextBox1;
    JSONObject jsonCredentials = new JSONObject();
    Integer AgeLimit = 2004;
    Web UserExists, CreateUser;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        VerticalArrangement accountLabelArrangement = new VerticalArrangement(this);
        accountLabelArrangement.HeightPercent(100);
        accountLabelArrangement.Image("cropped.png");

        CreateAccountLabel = new Label(accountLabelArrangement);
        CreateAccountLabel.Text("CREATE YOUR OWN ACCOUNT AND REGISTER NOW!!");
        CreateAccountLabel.TextColor(COLOR_BLACK);
        CreateAccountLabel.TextAlignment(ALIGNMENT_CENTER);
        CreateAccountLabel.HeightPercent(20);
        CreateAccountLabel.WidthPercent(100);
        CreateAccountLabel.FontSize(32);
        CreateAccountLabel.FontTypeface(TYPEFACE_SERIF);
        CreateAccountLabel.FontBold(true);
        CreateAccountLabel.FontItalic(true);

        EmailArrangement = new HorizontalArrangement(accountLabelArrangement);

        EmailLabel = new Label(EmailArrangement);
        EmailLabel.Text("Enter valid email:");
        EmailLabel.TextColor(COLOR_BLACK);
        EmailLabel.TextAlignment(ALIGNMENT_NORMAL);
        EmailLabel.HeightPercent(8);
        EmailLabel.WidthPercent(40);
        EmailLabel.FontSize(25);
        EmailLabel.FontTypeface(TYPEFACE_SERIF);
        //EmailLabel.FontBold(true);
        EmailLabel.FontItalic(true);

        EmailTextBox = new TextBox(EmailArrangement);
        EmailTextBox.TextAlignment(ALIGNMENT_NORMAL);
        EmailTextBox.Text("");
        EmailTextBox.FontSize(25);
        EmailTextBox.HeightPercent(8);
        EmailTextBox.WidthPercent(55);
        EmailTextBox.FontTypeface(TYPEFACE_SERIF);
        EmailTextBox.BackgroundColor(Colours.TextBoxColour);

        NameArrangement = new HorizontalArrangement(accountLabelArrangement);

        NameLabel = new Label(NameArrangement);
        NameLabel.Text("Enter name:");
        NameLabel.TextAlignment(Component.ALIGNMENT_NORMAL);
        NameLabel.TextColor(COLOR_BLACK);
        NameLabel.FontSize(25);
        NameLabel.HeightPercent(8);
        NameLabel.WidthPercent(40);
        NameLabel.FontTypeface(TYPEFACE_SERIF);
        //NameLabel.FontBold(true);
        NameLabel.FontItalic(true);

        NameTextBox = new TextBox(NameArrangement);
        NameTextBox.TextAlignment(ALIGNMENT_NORMAL);
        NameTextBox.Text("");
        NameTextBox.FontSize(25);
        NameTextBox.HeightPercent(8);
        NameTextBox.WidthPercent(55);
        NameTextBox.FontTypeface(TYPEFACE_SERIF);
        NameTextBox.BackgroundColor(Colours.TextBoxColour);

        YOBArrangement = new HorizontalArrangement(accountLabelArrangement);

        YOBLabel = new Label(YOBArrangement);
        YOBLabel.Text("Enter year of birth: (player must be over 18 to play)");
        YOBLabel.TextColor(COLOR_BLACK);
        YOBLabel.TextAlignment(ALIGNMENT_NORMAL);
        YOBLabel.HeightPercent(13);
        YOBLabel.WidthPercent(70);
        YOBLabel.FontSize(25);
        YOBLabel.FontTypeface(TYPEFACE_SERIF);
        YOBLabel.FontItalic(true);
        //YOBLabel.FontBold(true);

        YOBTextBox = new TextBox(YOBArrangement);
        YOBTextBox.TextAlignment(Component.ALIGNMENT_CENTER);
        YOBTextBox.Text("");
        YOBTextBox.FontSize(25);
        YOBTextBox.HeightPercent(10);
        YOBTextBox.WidthPercent(28);
        YOBTextBox.FontTypeface(TYPEFACE_SERIF);
        YOBTextBox.NumbersOnly(true);
        YOBTextBox.BackgroundColor(Colours.TextBoxColour);

        PasswordLabelArrangement = new HorizontalArrangement(accountLabelArrangement);

        PasswordLabel = new Label(PasswordLabelArrangement);
        PasswordLabel.Text("Enter password: (must be a min. of 8 characters)");
        PasswordLabel.TextColor(COLOR_BLACK);
        PasswordLabel.TextAlignment(ALIGNMENT_NORMAL);
        PasswordLabel.HeightPercent(10);
        PasswordLabel.WidthPercent(100);
        PasswordLabel.FontSize(25);
        PasswordLabel.FontTypeface(TYPEFACE_SERIF);
        PasswordLabel.FontItalic(true);
        //PasswordLabel.FontBold(true);


        // CRASHES WITH THIS ~~> PasswordTextBoxArrangementArrangement.BackgroundColor(Component.COLOR_BLUE);
        PasswordTextBoxArrangementArrangement = new VerticalArrangement(accountLabelArrangement);

        PasswordTextBoxArrangement = new HorizontalArrangement(PasswordTextBoxArrangementArrangement);
        PasswordTextBoxArrangement.WidthPercent(100);
        // horizonal arrangement: label1/textbox/label2

        LeftArrangementLabel = new Label(PasswordTextBoxArrangement);
        LeftArrangementLabel.Text(" ");
        LeftArrangementLabel.TextAlignment(ALIGNMENT_NORMAL);
        LeftArrangementLabel.HeightPercent(9);
        LeftArrangementLabel.WidthPercent(15);
        //LeftArrangementLabel.BackgroundColor(Component.COLOR_BLUE);
        LeftArrangementLabel.FontSize(25);

        PasswordTextBox1 = new PasswordTextBox(PasswordTextBoxArrangement);
        PasswordTextBox1.Text("");
        PasswordTextBox1.TextColor(COLOR_BLACK);
        PasswordTextBox1.TextAlignment(ALIGNMENT_NORMAL);
        PasswordTextBox1.HeightPercent(9);
        PasswordTextBox1.WidthPercent(70);
        PasswordTextBox1.FontSize(25);
        PasswordTextBox1.FontTypeface(TYPEFACE_SERIF);
        PasswordTextBox1.BackgroundColor(Colours.TextBoxColour);

        RightArrangementLabel = new Label(PasswordTextBoxArrangement);
        RightArrangementLabel.Text(" ");
        RightArrangementLabel.TextAlignment(ALIGNMENT_NORMAL);
        //RightArrangementLabel.BackgroundColor(Component.COLOR_RED);
        RightArrangementLabel.HeightPercent(9);
        RightArrangementLabel.WidthPercent(15);
        RightArrangementLabel.FontSize(25);

        PasswordTextBoxArrangement = new HorizontalArrangement(PasswordTextBoxArrangementArrangement);
        PasswordTextBoxArrangement.WidthPercent(100);

        LeftArrangementLabel = new Label(PasswordTextBoxArrangement);
        LeftArrangementLabel.Text(" ");
        LeftArrangementLabel.TextAlignment(ALIGNMENT_NORMAL);
        LeftArrangementLabel.HeightPercent(9);
        LeftArrangementLabel.WidthPercent(13);
        //LeftArrangementLabel.BackgroundColor(Component.COLOR_BLUE);
        LeftArrangementLabel.FontSize(25);

        BeginButton = new Button(PasswordTextBoxArrangement);
        BeginButton.HeightPercent(10);
        BeginButton.WidthPercent(75);
        BeginButton.Text("JOIN GAME!!");
        BeginButton.TextAlignment(ALIGNMENT_CENTER);
        BeginButton.TextColor(COLOR_BLACK);
        BeginButton.FontSize(15);
        BeginButton.BackgroundColor(Colours.ButtonsColour);
        BeginButton.FontTypeface(TYPEFACE_SERIF);
        BeginButton.FontItalic(true);
        BeginButton.Shape(Component.BUTTON_SHAPE_OVAL);

        RightArrangementLabel = new Label(PasswordTextBoxArrangement);
        RightArrangementLabel.Text(" ");
        RightArrangementLabel.TextAlignment(ALIGNMENT_NORMAL);
        // RightArrangementLabel.BackgroundColor(Component.COLOR_RED);
        RightArrangementLabel.HeightPercent(9);
        RightArrangementLabel.WidthPercent(13);
        RightArrangementLabel.FontSize(25);

        CreateUser = new Web(this);
        CreateUser.Url("https://grassworld.fachtnaroe.net/auth/");
        UserExists = new Web(this);
        UserExists.Url("https://grassworld.fachtnaroe.net/auth/");

        EventDispatcher.registerEventForDelegation(this, formName, "Click");
        EventDispatcher.registerEventForDelegation(this, formName, "Timer");
        EventDispatcher.registerEventForDelegation(this, formName, "GotText");
        EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
        EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
    }

    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params) {

        System.err.print("dispatchEvent: " + formName + " [" + component.toString() + "] [" + componentName + "] " + eventName);
        if (eventName.equals("BackPressed")) {
            // this would be a great place to do something useful
            return true;
        }
        else if (eventName.equals("Click")) {
            dbg("E");
            if (component.equals(BeginButton)) {
                if (Integer.parseInt(YOBTextBox.Text()) >AgeLimit) {
                    BeginButton.Text("You are too young to play this game :(");
                    dbg("A");
                }
                else {
                    dbg("B");
                    if (EmailTextBox.Text().contains("@")) {
                        dbg("C");
                        try {
                            jsonCredentials.put("action", "validate");
                            jsonCredentials.put("user", EmailTextBox.Text());
                            System.err.print("Sending: " + jsonCredentials.toString());
                            String msg = jsonCredentials.toString();
                            UserExists.PostText(msg);
                            dbg("F");
                        }
                        catch (Exception e) {
                            dbg("D");
                            return false;
                        }
                    }
                }
            }
        }
        else if (eventName.equals("GotText")) {
            if (component.equals(UserExists)) {
                String status = params[1].toString();
                String textOfResponse = (String) params[3];
                dbg("K");
                if (textOfResponse.equals("")) {
                    textOfResponse = status;
                }
                if (status.equals("200")) {
                    try {
                        JSONObject parser = new JSONObject(textOfResponse);
                        dbg("L");
                        if (parser.getString("status").equals("OK")) {
                            String result = parser.getString("user");
                            if (result.contentEquals("exists")) {
                                //display an error
                                BeginButton.Text("An account with this email already exists, please try another login or use a different email!");
                            }
                            else {
                                //can create user
                                try {
                                    jsonCredentials.put("action", "register");
                                    jsonCredentials.put("user", EmailTextBox.Text());
                                    jsonCredentials.put("password", PasswordTextBox1.Text());
                                    jsonCredentials.put("fullname", NameTextBox.Text());
                                    jsonCredentials.put("yob", YOBTextBox.Text());
                                    System.err.print("Registering: " + jsonCredentials.toString());
                                    String msg = jsonCredentials.toString();
                                    CreateUser.PostText(msg);
                                }
                                catch (Exception e) {
                                    return false;
                                }
                            }
                        }
                        else {
                            BeginButton.Text(parser.getString("status"));
                        }
                    }
                    catch (JSONException e) {
                        BeginButton.Text("error connecting1 " + status);
                    }
                }
                else {
                    BeginButton.Text("error connecting2 " + status);
                    try {
                        jsonCredentials.put("action", "register");
                        jsonCredentials.put("user", EmailTextBox.Text());
                        jsonCredentials.put("password", PasswordTextBox1.Text());
                        jsonCredentials.put("fullname", NameTextBox.Text());
                        jsonCredentials.put("yob", YOBTextBox.Text());
                        System.err.print("Registering: " + jsonCredentials.toString());
                        String msg = jsonCredentials.toString();
                        CreateUser.PostText(msg);
                    }
                    catch (Exception e) {
                        return false;
                    }
                }
                return true;
            }
            else if (component.equals(CreateUser)) {
                dbg("G");
                String status = params[1].toString();
                String textOfResponse = (String) params[3];
                if (status.equals("200")) {
                    dbg("H");
                    try {
                        JSONObject parser = new JSONObject(textOfResponse);
                        if (parser.getString("status").equals("OK")) {
                            String result = parser.getString("userid");
                            dbg("I");
                            if (Integer.parseInt(result) > 0) {
                                return true;
                            }
                        }
                        else {
                            // error message for user -- backend problem
                                BeginButton.Text("There is currently a problem with the backend, please try again later");
                            dbg("J");
                        }
                    }
                    catch (JSONException e) {
                        return true;
                    }
                }
            }
        }
        dbg("M");
        return false;
    }
    public static void dbg (String debugMsg) {
        System.err.print( "~~~> " + debugMsg + " <~~~\n\n");
    }
}

//    public static void dbg (String debugMsg) {
//        System.err.print( "~~~> " + debugMsg + " <~~~\n");
 //   }
//}
// Here be monsters:
// put unwanted code here, or experimental code awaiting placement
// https://fachtnaroe.net/qndPasswordLabeldevice=&sensor=CELCIUS