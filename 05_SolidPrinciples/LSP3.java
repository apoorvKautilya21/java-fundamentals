class Notifications {
  public void sendNotification() {
    System.out.println("Sending email notification");
  }
}

class TextNotifications extends Notifications {
  @Override
  public void sendNotification() {
    System.out.println("Sending text notification");
  }
}

class PushNotifications extends Notifications {
  @Override
  public void sendNotification() {
    System.out.println("Sending push notification");
  }
}

/*
************ Substitution Is Seamless ************

In the main() method:

The type used is the superclass (Notifications) in all three cases.

The runtime behavior depends on the actual object type (Notifications, TextNotifications, PushNotifications).

Each subclass overrides the sendNotification() method without changing its contract — it still sends a notification, just in a different form.

There is no additional requirement, no unexpected side effect, and no broken behavior when substituting a subclass for the parent class.

************ What Would Break LSP? ************

Suppose TextNotifications or PushNotifications overrode the method in a way that:

Threw an exception

Required different input types

Changed return types

Changed semantics (e.g., “delete user” instead of “send notification”)



*************** “Correct behavior” in LSP means: ***************

The subclass honors the intent and expectations of the base class’s methods.

The subclass does not violate any assumptions that the client code (the part using the class) relies on.

The method contracts (inputs/outputs, side effects, invariants) are preserved or strengthened, not weakened.

*/

public class LSP3 {
  public static void main(String[] args) {
    Notifications email = new Notifications();
    Notifications text = new TextNotifications();
    Notifications push = new PushNotifications();

    email.sendNotification();
    text.sendNotification();
    push.sendNotification();
  }
}
