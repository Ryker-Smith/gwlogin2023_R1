 package com.example.grassworld;

 import com.google.appinventor.components.runtime.Button;
 import com.google.appinventor.components.runtime.Component;
 import com.google.appinventor.components.runtime.EventDispatcher;
 import com.google.appinventor.components.runtime.Form;
 import com.google.appinventor.components.runtime.HandlesEventDispatching;
 import com.google.appinventor.components.runtime.TableArrangement;
 import com.google.appinventor.components.runtime.VerticalArrangement;
 import com.google.appinventor.components.runtime.WebViewer;

 public class GamescreenActivity extends Form implements HandlesEventDispatching {
     private
     VerticalArrangement Main, ColourTable, spacer;
     TableArrangement ControlsArrangement;
     WebViewer WebGame;
     Button UpArrow, DownArrow, LeftArrow, RightArrow, EatButton, SleepButton, BackpackButton, FightButton, GolferButton, PickUpButton, WakeButton, ProjectileButton;

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
         ColourTable.Image("grass.png");
         ColourTable.WidthPercent(100);
         ColourTable.Height(Component.LENGTH_FILL_PARENT);

         ControlsArrangement = new TableArrangement(ColourTable);
         ControlsArrangement.Width(LENGTH_FILL_PARENT);
         ControlsArrangement.Height(LENGTH_FILL_PARENT);
         ControlsArrangement.Columns(8);
         ControlsArrangement.Rows(6);

         spacer = new VerticalArrangement(ControlsArrangement);
         spacer.Width(30);
         //spacer.HeightPercent(15);
         spacer.Column(0);
         spacer.Row(0);

         UpArrow = new Button(ControlsArrangement);
         UpArrow.Column(4);
         UpArrow.Row(0);
         UpArrow.BackgroundColor(Component.COLOR_GRAY);
         UpArrow.Height(60);
         UpArrow.Width(60);
         UpArrow.Shape(BUTTON_SHAPE_OVAL);
         UpArrow.FontSize(18);
         UpArrow.Text("↑");

         DownArrow = new Button(ControlsArrangement);
         DownArrow.Column(4);
         DownArrow.Row(2);
         DownArrow.BackgroundColor(Component.COLOR_GRAY);
         DownArrow.Height(60);
         DownArrow.Width(60);
         DownArrow.Shape(BUTTON_SHAPE_OVAL);
         DownArrow.FontSize(18);
         DownArrow.Text("↓");

         LeftArrow = new Button(ControlsArrangement);
         LeftArrow.Column(3);
         LeftArrow.Row(1);
         LeftArrow.BackgroundColor(Component.COLOR_GRAY);
         LeftArrow.Height(60);
         LeftArrow.Width(60);
         LeftArrow.Shape(BUTTON_SHAPE_OVAL);
         LeftArrow.FontSize(18);
         LeftArrow.Text("←");

         RightArrow = new Button(ControlsArrangement);
         RightArrow.Column(5);
         RightArrow.Row(1);
         RightArrow.BackgroundColor(Component.COLOR_GRAY);
         RightArrow.Height(60);
         RightArrow.Width(60);
         RightArrow.Shape(BUTTON_SHAPE_OVAL);
         RightArrow.FontSize(18);
         RightArrow.Text("→");

         SleepButton = new Button(ControlsArrangement);
         SleepButton.Column(1);
         SleepButton.Row(0);
         SleepButton.BackgroundColor(Component.COLOR_GRAY);
         SleepButton.Height(60);
         SleepButton.Width(60);
         SleepButton.Shape(BUTTON_SHAPE_OVAL);
         SleepButton.FontSize(18);
         SleepButton.Text("\uD83D\uDCA4");

         EatButton = new Button(ControlsArrangement);
         EatButton.Column(1);
         EatButton.Row(1);
         EatButton.BackgroundColor(Component.COLOR_GRAY);
         EatButton.Height(60);
         EatButton.Width(60);
         EatButton.Shape(BUTTON_SHAPE_OVAL);
         EatButton.FontSize(18);
         EatButton.Text("\uD83C\uDF74");
         
         BackpackButton = new Button(ControlsArrangement);
         BackpackButton.Column(1);
         BackpackButton.Row(2);
         BackpackButton.BackgroundColor(Component.COLOR_GRAY);
         BackpackButton.Height(60);
         BackpackButton.Width(60);
         BackpackButton.Shape(BUTTON_SHAPE_OVAL);
         BackpackButton.FontSize(18);
         BackpackButton.Text("\uD83C\uDF92");

         FightButton = new Button(ControlsArrangement);
         FightButton.Column(1);
         FightButton.Row(3);
         FightButton.BackgroundColor(Component.COLOR_GRAY);
         FightButton.Height(60);
         FightButton.Width(60);
         FightButton.Shape(Component.BUTTON_SHAPE_OVAL);
         FightButton.FontSize(18);
         FightButton.Text("\uD83D\uDCA2 ");

         GolferButton = new Button(ControlsArrangement);
         GolferButton.Column(7);
         GolferButton.Row(0);
         GolferButton.BackgroundColor(Component.COLOR_GRAY);
         GolferButton.Height(60);
         GolferButton.Width(60);
         GolferButton.Shape(Component.BUTTON_SHAPE_OVAL);
         GolferButton.FontSize(18);
         GolferButton.Text("\uD83C\uDFCC\uD83C\uDFFC");
         
         PickUpButton = new Button(ControlsArrangement);
         PickUpButton.Column(7);
         PickUpButton.Row(1);
         PickUpButton.BackgroundColor(Component.COLOR_GRAY);
         PickUpButton.Height(60);
         PickUpButton.Width(60);
         PickUpButton.Shape(BUTTON_SHAPE_OVAL);
         PickUpButton.FontSize(18);
         PickUpButton.Text("\uD83E\uDD0C");
         
         WakeButton = new Button(ControlsArrangement);
         WakeButton.Column(7);
         WakeButton.Row(2);
         WakeButton.BackgroundColor(Component.COLOR_GRAY);
         WakeButton.Height(60);
         WakeButton.Width(60);
         WakeButton.Shape(Component.BUTTON_SHAPE_OVAL);
         WakeButton.FontSize(18);
         WakeButton.Text("\uD83E\uDD71");
         
         ProjectileButton = new Button(ControlsArrangement);
         ProjectileButton.Column(7);
         ProjectileButton.Row(3);
         ProjectileButton.BackgroundColor(Component.COLOR_GRAY);
         ProjectileButton.Height(60);
         ProjectileButton.Width(60);
         ProjectileButton.Shape(Component.BUTTON_SHAPE_OVAL);
         ProjectileButton.FontSize(18);
         ProjectileButton.Text("\uD83C\uDFAF");
         


         EventDispatcher.registerEventForDelegation(this, formName, "Click");
         EventDispatcher.registerEventForDelegation(this, formName, "Timer");
         EventDispatcher.registerEventForDelegation(this, formName, "GotText");
         EventDispatcher.registerEventForDelegation(this, formName, "BackPressed");
         EventDispatcher.registerEventForDelegation(this, formName, "OtherScreenClosed");
     }
 }

// Here be monsters:
// put unwanted code here, or experimental code awaiting placement
