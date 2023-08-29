public class Main {
    public static void main(String[] args) {
        /*
Welcome to Our Java Class GitHub Page! 🚀

Hello Classmates,

Welcome to our Java programming journey! This GitHub page is designed to be a hub for all our collaborative coding endeavors,
learning resources, and project showcases.
Whether you're a seasoned coder or just starting your Java adventure,
 you're in the right place.

## What to Expect:

📚 **Learning Resources:** Find useful guides, tutorials, and reference materials to help you grasp Java concepts and coding techniques.

👥 **Collaboration:** Explore our shared repositories where we'll collaborate on assignments, projects, and code challenges. Don't hesitate to collaborate, share ideas, and ask questions.

🌟 **Project Showcases:** Witness the culmination of our hard work as we showcase our completed projects. It's a great opportunity to learn from each other and celebrate our accomplishments.

## Get Involved:

1. **Explore Repositories:** Check out the repositories to find assignments, projects, and other resources. Feel free to clone, fork, and contribute!

2. **Collaborate:** Don't be shy! Join in discussions, share your insights, and collaborate with fellow classmates on coding tasks.

3. **Stay Updated:** Watch this repository for updates. We'll keep you posted on new assignments, upcoming deadlines, and class announcements.

4. **Have Fun:** Learning Java can be an exciting journey. Embrace challenges, experiment with code, and remember, it's okay to make mistakes – they're a part of learning!

## Connect with Us:

Let's make the most of this opportunity to learn and grow together. If you have questions, ideas, or just want to chat, don't hesitate to reach out on our communication channels.

- **Discord:** Join our class Discord Server for real-time discussions and quick queries. Message me for the link.


Looking forward to a fantastic Java learning experience with all of you!



*/
String aMessage = "Happy Coding, ";
String theGuy = "Jordy";

theMessage(aMessage, theGuy);


    }

    public static void theMessage( String theMessage, String theGuy){
        String aMessage = "Happy Coding, ";
        String theDude = "Jordy";
        if(theMessage.equals(aMessage) && theGuy.equals(theDude)){
            System.out.println(aMessage + theGuy);
        }
    }
}