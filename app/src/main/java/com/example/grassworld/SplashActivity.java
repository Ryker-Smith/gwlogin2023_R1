package com.example.grassworld;


import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.PasswordTextBox;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.EventDispatcher;

public class SplashActivity extends Form implements HandlesEventDispatching {
    private
    VerticalArrangement Main;
    Clock SplashScreenTime;
    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        Main = new VerticalArrangement(this);
        Main.HeightPercent(100);
        Main.WidthPercent(100);
        Main.Image("RealLogo.png");

        SplashScreenTime = new Clock(Main);
        SplashScreenTime.TimerInterval(5000);
        SplashScreenTime.TimerEnabled(true);

        //EventDispatcher.registerEventForDelegation(this, formName, "Click");
        EventDispatcher.registerEventForDelegation(this, formName, "Timer");
       //EventDispatcher.registerEventForDelegation(this, formName, "GotText");
        //EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
        //EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
    }

    public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params) {

        System.err.print("dispatchEvent: " + formName + " [" + component.toString() + "] [" + componentName + "] " + eventName);
        if (eventName.equals("BackPressed")) {
            // this would be a great place to do something useful
            return true;
        } else if (eventName.equals("Timer")) {
            if (component.equals(SplashScreenTime)) {
                SplashScreenTime.TimerEnabled(false);
                switchForm("MainActivity");
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