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
import com.google.appinventor.components.runtime.Web;
import com.google.appinventor.components.runtime.WebViewer;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends Form implements HandlesEventDispatching {

    public static final String URL_LOGIN = "https://grassworld.fachtnaroe.net/auth/";
    public static final String forTesting_User="lola.davern22@student.tcfe.ie";
    public static final String forTesting_Pass="t3mp0rary";
    public static final boolean TESTING=true;
    public static final String URL_MAIN="https://grassworld.fachtnaroe.net/";
    public static final Integer SplashTimeOut=1000;
    // the buildNumber can be generated automatically. Look in build.gradle to see how
    public final String buildNumber=Integer.toString(BuildConfig.VERSION_CODE);
    //    public final String versionName=BuildConfig.VERSION_NAME;

    private
    VerticalArrangement Main, VerticalArrangement2, VerticalArrangement3;
    HorizontalArrangement EmailArrangement, PasswordArrangement, HorizontalArrangement3;
    Label GrassworldLabel, LoginLabel, PasswordLabel, EmailLabel, RegisterLabel;
    TextBox InsertEmail;
    Button CreateAnAccountButton, BeginGameButton;
    PasswordTextBox LoginPassword;
    JSONObject jsonLoginInfo = new JSONObject();
    Web WebAuthenticate;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        Main = new VerticalArrangement(this);
        Main.HeightPercent(100);
        Main.Image("cropped.png");

        GrassworldLabel = new Label(Main);
        GrassworldLabel.Text("GRASSWORLD");
        GrassworldLabel.TextColor(COLOR_GREEN);
        GrassworldLabel.TextAlignment(ALIGNMENT_CENTER);
        GrassworldLabel.HeightPercent(7);
        GrassworldLabel.WidthPercent(100);
        GrassworldLabel.FontSize(35);
        GrassworldLabel.FontTypeface(TYPEFACE_SERIF);
        GrassworldLabel.FontBold(true);
        GrassworldLabel.FontItalic(true);

        LoginLabel = new Label(Main);
        LoginLabel.Text("LOGIN:");
        LoginLabel.TextAlignment(Component.ALIGNMENT_CENTER);
        LoginLabel.TextColor(COLOR_BLACK);
        LoginLabel.FontSize(30);
        LoginLabel.HeightPercent(10);
        LoginLabel.WidthPercent(100);
        LoginLabel.FontTypeface(TYPEFACE_SERIF);
        LoginLabel.FontBold(true);
        LoginLabel.FontItalic(true);

        VerticalArrangement2 = new VerticalArrangement(Main);
        // VerticalArrangement2.BackgroundColor(Component.COLOR_GRAY);
        EmailArrangement = new HorizontalArrangement(VerticalArrangement2);


        EmailLabel = new Label(EmailArrangement);
        EmailLabel.Text("Email:");
        EmailLabel.TextColor(COLOR_BLACK);
        EmailLabel.TextAlignment(ALIGNMENT_NORMAL);
        EmailLabel.HeightPercent(8);
        EmailLabel.WidthPercent(50);
        EmailLabel.FontSize(30);
        EmailLabel.FontTypeface(TYPEFACE_SERIF);
        //EmailLabel.BackgroundColor(COLOR_GRAY);
        EmailLabel.FontItalic(true);

        InsertEmail = new TextBox(EmailArrangement);
        InsertEmail.TextAlignment(ALIGNMENT_CENTER);
        InsertEmail.Text("");
        InsertEmail.FontSize(25);
        InsertEmail.HeightPercent(8);
        InsertEmail.WidthPercent(50);
        InsertEmail.FontTypeface(TYPEFACE_SERIF);
        InsertEmail.BackgroundColor(Component.COLOR_WHITE);

        PasswordArrangement = new HorizontalArrangement(VerticalArrangement2);
        PasswordArrangement.HeightPercent(13);

        PasswordLabel = new Label(PasswordArrangement);
        PasswordLabel.Text("Password:");
        PasswordLabel.TextColor(COLOR_BLACK);
        PasswordLabel.TextAlignment(ALIGNMENT_NORMAL);
        PasswordLabel.HeightPercent(8);
        PasswordLabel.WidthPercent(50);
        PasswordLabel.FontSize(30);
        PasswordLabel.FontTypeface(TYPEFACE_SERIF);
        //PasswordLabel.BackgroundColor(COLOR_GRAY);
        PasswordLabel.FontItalic(true);

        LoginPassword = new PasswordTextBox(PasswordArrangement);
        LoginPassword.Text("");
        LoginPassword.TextColor(COLOR_BLACK);
        LoginPassword.TextAlignment(ALIGNMENT_CENTER);
        LoginPassword.HeightPercent(8);
        LoginPassword.WidthPercent(50);
        LoginPassword.FontSize(25);
        LoginPassword.FontTypeface(TYPEFACE_SERIF);
        LoginPassword.BackgroundColor(COLOR_WHITE);

        BeginGameButton = new Button(VerticalArrangement2);
        BeginGameButton.HeightPercent(12);
        BeginGameButton.WidthPercent(100);
        BeginGameButton.Text("BEGIN GAME!!");
        BeginGameButton.TextAlignment(ALIGNMENT_CENTER);
        BeginGameButton.TextColor(COLOR_BLACK);
        BeginGameButton.FontSize(30);
        BeginGameButton.BackgroundColor(COLOR_PINK);
        BeginGameButton.FontTypeface(TYPEFACE_SERIF);
        BeginGameButton.FontItalic(true);
        BeginGameButton.Shape(Component.BUTTON_SHAPE_OVAL);

        VerticalArrangement3 = new VerticalArrangement(VerticalArrangement2);

        RegisterLabel = new Label(VerticalArrangement3);
        RegisterLabel.Text("OR");
        RegisterLabel.TextColor(COLOR_BLACK);
        RegisterLabel.TextAlignment(ALIGNMENT_CENTER);
        RegisterLabel.HeightPercent(8);
        RegisterLabel.WidthPercent(100);
        RegisterLabel.FontSize(40);
        RegisterLabel.FontTypeface(TYPEFACE_SERIF);
        RegisterLabel.FontItalic(true);
        RegisterLabel.FontBold(true);

        CreateAnAccountButton = new Button(VerticalArrangement3);
        CreateAnAccountButton.HeightPercent(12);
        CreateAnAccountButton.WidthPercent(100);
        CreateAnAccountButton.Text("CREATE AN ACCOUNT!!");
        CreateAnAccountButton.TextAlignment(ALIGNMENT_CENTER);
        CreateAnAccountButton.TextColor(COLOR_BLACK);
        CreateAnAccountButton.FontSize(30);
        CreateAnAccountButton.BackgroundColor(COLOR_PINK);
        CreateAnAccountButton.FontTypeface(TYPEFACE_SERIF);
        CreateAnAccountButton.FontItalic(true);
        CreateAnAccountButton.Shape(Component.BUTTON_SHAPE_OVAL);

        WebAuthenticate = new Web(this);
        WebAuthenticate.Url("https://grassworld.fachtnaroe.net/auth/");

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
            
        } else if (eventName.equals("Click")) {
            if (component.equals(BeginGameButton)) {
                System.err.print("You pressed a button");
               // if (InsertEmail.Text().length()>5) {
               //     BeginGameButton.Text("Bad email :(");
                //}
               // if (LoginPassword.Text().length()>2) {
              //      BeginGameButton.Text("Bad password :(");
              //  }
                try {
                    jsonLoginInfo.put("action", "login");
                    dbg(InsertEmail.Text());
                    jsonLoginInfo.put("user", InsertEmail.Text());
                    dbg(LoginPassword.Text());
                    jsonLoginInfo.put("password", LoginPassword.Text());
                    String msg = jsonLoginInfo.toString();
                    WebAuthenticate.PostText(msg);
                } catch (Exception e) {
                    dbg(e.toString());
                    dbg("error 172");
                    return false;
                }
                return true;
            } else if (component.equals(CreateAnAccountButton)) {
                switchForm("RegisterActivity");
            }
        } else if (eventName.equals("GotText")) {
            if (component.equals(WebAuthenticate)) {
                String status = params[1].toString();
                String textOfResponse = (String) params[3];
                if (textOfResponse.equals("")) {
                    textOfResponse = status;
                }
                if (status.equals("200")) {
                    try {
                        JSONObject parser = new JSONObject(textOfResponse);
                        if (parser.getString("status").equals("error")) {
                            BeginGameButton.Text(parser.getString("detail"));
                            BeginGameButton.Enabled(true);
                            if (parser.getString("detail").equals("unknown")) {
                            BeginGameButton.Text("Incorrect Email!");
                            }
                            if (parser.getString("detail").equals("bad login")) {
                            BeginGameButton.Text("Incorrect password!");
                            }
                        }
                        else {
                            String token = parser.getString("token");
                            BeginGameButton.Text("Login work!");
                            switchForm("GamescreenActivity");
                        }
                    }
                    catch (JSONException e){
                        BeginGameButton.Text("error e177 processing response");
                        BeginGameButton.Enabled(true);
                    }
                }
                else{
                    BeginGameButton.Text("error e182 processing response"+status);
                    dbg(status);
                    BeginGameButton.Enabled(true);
                }
            }
        }
        // true means event has been handled by us (ie recognised)
        return false;
    }
    public static void dbg (String debugMsg) {
        System.err.print( "~~~> " + debugMsg + " <~~~\n\n");
    }

}
// this would be a great place to do something useful
//
// Here be monsters:
// put unwanted code here, or experimental code awaiting placement

//         else if (eventName.equals("Click")) {
//            if (component.equals(button_Login)) {
//                WebGame.Url(https://grassworld.fachtnaroe.net/);
//                WebGame.Get();
//                return true;
//            }

// (https://grassworld.fachtnaroe.net/);

//        if (eventName.equals("BackPressed")) {
//            // this would be a great place to do something useful
//            return true;
//        } else if (eventName.equals("Click")) {
//
//        } else if (eventName.equals("GotText")) {
//            dbg("GotText");
//                     else if (eventName.equals("Click")) {
//            if (component.equals(BeginGameButton)) {
//                WebGame.Url(https://grassworld.fachtnaroe.net/);
//                WebGame.Get();
//                return true;
//            }
//        }
//        return false;
//    }
//    public static void dbg (String debugMsg) {
//        System.err.print( "~~~> " + debugMsg + " <~~~\n");
//    }
//}