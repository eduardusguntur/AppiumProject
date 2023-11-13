package Utils;

import java.util.Arrays;
import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;

import io.appium.java_client.AppiumDriver;

public class SwipeHelper {
    public static void verticalSwipe(AppiumDriver appiumDriver, String swipeStart) {

        //Declare screenSize(as Dimension) to get the size of the window of your phone
        Dimension screenSize = appiumDriver.manage().window().getSize();
        //Declare startY(as int) to put the starting point of vertical swipe(70% of the screen size from the top)
        int startY = (int) (screenSize.getHeight() * 0.70);
        //Declare startY(as int) to put the end point of vertical swipe(30% of the screen size from the top)
        int endY = (int) (screenSize.getHeight() * 0.30);
        //Declare the centerX(as int) as the horizontal point where you want to swipe from(in the middle of the screen)
        int centerX = screenSize.width / 2;

        //Declare variable as PointerInput to use what kind of input you want to use
        PointerInput finger = new PointerInput(Kind.TOUCH, "finger");
        //Declare variable as Sequence to add action
        Sequence swipe = new Sequence(finger, 1);

        //Swipe ke Atas "bottom"
        if ("up".equalsIgnoreCase(swipeStart)) {

            //Move finger to starting position
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int)startY));
            //Finger touch the screen
            swipe.addAction(finger.createPointerDown(0));
            //Move finger to end position
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int)endY));
            //Finger untouch the screen
            swipe.addAction(finger.createPointerUp(0));
            
        }

        //Swipe ke bawah "top"
        if ("down".equalsIgnoreCase(swipeStart)) {

            //Move finger to starting position
            swipe.addAction(finger.createPointerMove(Duration.ofSeconds(0), PointerInput.Origin.viewport(), centerX, (int)endY));
            //Finger touch the screen
            swipe.addAction(finger.createPointerDown(0));
            //Move finger to end position
            swipe.addAction(finger.createPointerMove(Duration.ofMillis(700), PointerInput.Origin.viewport(), centerX, (int)startY));
            //Finger untouch the screen
            swipe.addAction(finger.createPointerUp(0));
            
        }
        
        //Perform the swipe to bottom action, perform method needs the swipe actions above to be converted to arrays
        appiumDriver.perform(Arrays.asList(swipe));

    }
    
}
