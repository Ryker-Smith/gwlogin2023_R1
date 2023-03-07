 package com.example.grassworld;

 import android.graphics.drawable.shapes.OvalShape;

 import com.google.appinventor.components.runtime.Button;
 import com.google.appinventor.components.runtime.Component;
 import com.google.appinventor.components.runtime.EventDispatcher;
 import com.google.appinventor.components.runtime.Form;
 import com.google.appinventor.components.runtime.HandlesEventDispatching;
 import com.google.appinventor.components.runtime.HorizontalArrangement;
 import com.google.appinventor.components.runtime.Label;
 import com.google.appinventor.components.runtime.TableArrangement;
 import com.google.appinventor.components.runtime.TextBox;
 import com.google.appinventor.components.runtime.VerticalArrangement;
 import com.google.appinventor.components.runtime.PasswordTextBox;
 import com.google.appinventor.components.runtime.WebViewer;

 public class GamescreenActivity extends Form implements HandlesEventDispatching {
     private
     VerticalArrangement Main, ColourTable;
     TableArrangement ControlsArrangement;
     WebViewer WebGame;
     Button UpArrow, DownArrow, LeftArrow, RightArrow,EatButton, SleepButton, BackpackButton;

     protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
         /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
         this.Sizing("Responsive");

         Main = new VerticalArrangement(this);
         Main.WidthPercent(100);
         Main.HeightPercent(65);

         WebGame = new WebViewer(Main);
         WebGame.HeightPercent(100);
         WebGame.WidthPercent(100);
         WebGame.GoToUrl("https://grassworld.fachtnaroe.net/");

         ColourTable = new VerticalArrangement(this);
         ColourTable.BackgroundColor(Colours.GameColour);
         ColourTable.WidthPercent(100);
         ColourTable.Height(Component.LENGTH_FILL_PARENT);

         ControlsArrangement = new TableArrangement(ColourTable);
         ControlsArrangement.Width(LENGTH_FILL_PARENT);
         ControlsArrangement.Height(LENGTH_FILL_PARENT);
         ControlsArrangement.Columns(9);
         ControlsArrangement.Rows(5);

         UpArrow = new Button(ControlsArrangement);
         UpArrow.Column(7);
         UpArrow.Row(0);
         UpArrow.BackgroundColor(Component.COLOR_GRAY);
         UpArrow.Height(60);
         UpArrow.Width(60);
         UpArrow.Shape(BUTTON_SHAPE_OVAL);
         UpArrow.FontSize(18);
         UpArrow.Text("↑");

         DownArrow = new Button(ControlsArrangement);
         DownArrow.Column(7);
         DownArrow.Row(2);
         DownArrow.BackgroundColor(Component.COLOR_GRAY);
         DownArrow.Height(60);
         DownArrow.Width(60);
         DownArrow.Shape(BUTTON_SHAPE_OVAL);
         DownArrow.FontSize(20);
         DownArrow.Text("↓");

         LeftArrow = new Button(ControlsArrangement);
         LeftArrow.Column(5);
         LeftArrow.Row(1);
         LeftArrow.BackgroundColor(Component.COLOR_GRAY);
         LeftArrow.Height(60);
         LeftArrow.Width(60);
         LeftArrow.Shape(BUTTON_SHAPE_OVAL);
         LeftArrow.FontSize(20);
         LeftArrow.Text("←");

         RightArrow = new Button(ControlsArrangement);
         RightArrow.Column(8);
         RightArrow.Row(1);
         RightArrow.BackgroundColor(Component.COLOR_GRAY);
         RightArrow.Height(60);
         RightArrow.Width(60);
         RightArrow.Shape(BUTTON_SHAPE_OVAL);
         RightArrow.FontSize(20);
         RightArrow.Text("→");

         SleepButton = new Button(ControlsArrangement);
         SleepButton.Column(1);
         SleepButton.Row(0);
         SleepButton.BackgroundColor(Component.COLOR_GRAY);
         SleepButton.Height(60);
         SleepButton.Width(60);
         SleepButton.Shape(BUTTON_SHAPE_OVAL);
         SleepButton.FontSize(20);
         SleepButton.Text("\uD83D\uDCA4");

         EatButton = new Button(ControlsArrangement);
         EatButton.Column(1);
         EatButton.Row(1);
         EatButton.BackgroundColor(Component.COLOR_GRAY);
         EatButton.Height(60);
         EatButton.Width(60);
         EatButton.Shape(BUTTON_SHAPE_OVAL);
         EatButton.FontSize(20);
         EatButton.Text("\uD83C\uDF74");
         
         BackpackButton = new Button(ControlsArrangement);
         BackpackButton.Column(1);
         BackpackButton.Row(2);
         BackpackButton.BackgroundColor(Component.COLOR_GRAY);
         BackpackButton.Height(60);
         BackpackButton.Width(60);
         BackpackButton.Shape(BUTTON_SHAPE_OVAL);
         BackpackButton.FontSize(20);
         BackpackButton.Text("\uD83C\uDF92");
         
         Main = new VerticalArrangement(ControlsArrangement);
         Main.WidthPercent(12);
         Main.HeightPercent(15);
         Main.Column(0);
         Main.Row(2);

         EventDispatcher.registerEventForDelegation(this, formName, "Click");
         EventDispatcher.registerEventForDelegation(this, formName, "Timer");
         EventDispatcher.registerEventForDelegation(this, formName, "GotText");
         EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
         EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
     }
 }

// Here be monsters:
// put unwanted code here, or experimental code awaiting placement
