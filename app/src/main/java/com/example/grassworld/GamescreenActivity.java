 package com.example.grassworld;

 import com.google.appinventor.components.runtime.Button;
 import com.google.appinventor.components.runtime.Component;
 import com.google.appinventor.components.runtime.EventDispatcher;
 import com.google.appinventor.components.runtime.Form;
 import com.google.appinventor.components.runtime.HandlesEventDispatching;
 import com.google.appinventor.components.runtime.HorizontalArrangement;
 import com.google.appinventor.components.runtime.Label;
 import com.google.appinventor.components.runtime.TextBox;
 import com.google.appinventor.components.runtime.VerticalArrangement;
 import com.google.appinventor.components.runtime.PasswordTextBox;
 import com.google.appinventor.components.runtime.WebViewer;

 public class GamescreenActivity extends Form implements HandlesEventDispatching {
     private
     VerticalArrangement VerticalArrangement1;
     WebViewer WebGame;


     protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
         /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
         this.Sizing("Responsive");


         EventDispatcher.registerEventForDelegation(this, formName, "Click");
         EventDispatcher.registerEventForDelegation(this, formName, "Timer");
         EventDispatcher.registerEventForDelegation(this, formName, "GotText");
         EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
         EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
     }
 }
// Here be monsters:
// put unwanted code here, or experimental code awaiting placement
