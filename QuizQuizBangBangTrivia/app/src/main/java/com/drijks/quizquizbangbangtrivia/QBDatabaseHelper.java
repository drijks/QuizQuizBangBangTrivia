package com.drijks.quizquizbangbangtrivia;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.Context;

public class QBDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_Name = "trivia";
    private static final int DB_Version = 1;

    QBDatabaseHelper(Context context) {
        super(context, DB_Name, null, DB_Version);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE QUESTION ("
                + "_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "NAME TEXT, "
                + "THEQUESTION TEXT, "
                + "REALANSWER TEXT, "
                + "FAKEANSWER1 TEXT, "
                + "FAKEANSWER2 TEXT, "
                + "FAKEANSWER3 TEXT, "
                + "CATEGORY TEXT, "
                + "SUBCATEGORY TEXT, "
                + "FUNFACT TEXT);");
        insertQuestion(db, "Ep1Question1", "Appointed in 1981 by President Ronald Reagan, who was the first woman to serve on the Supreme Court?", "Sandra Day O'Connor", "\"Harriet Tubman", "Bram Stoker", "Oprah Winfrey", "social_sciences", "politics", "This is a fun fact.");
        insertQuestion(db,"Ep1Question2", "Released in 1939 and nominated for 13 Oscars, which was the first movie in color to win an Academy Award?", "Gone With the Wind", "Star Wars", "Harry Potter", "The Wizard of Oz", "media", "film", "This is a fun fact.");
        insertQuestion(db, "Ep1Question3", "The letter \"Q\" does not appear in any official element names on the periodic table, however temporary element names such as ununquadium contain this letter. Which letter does not appear on the periodic table at all?", "J", "K", "A", "F", "math_and_science", "chemistry", "This is a fun fact.");
        insertQuestion(db,"Ep1Question4", "Which country was the first to win the World Cup?", "Uruguay", "Spain", "Germany", "France", "sports", "sports", "This is a fun fact.");
        insertQuestion(db,"Ep1Question5", "Who was the only president to serve two non-consecutive terms?", "Grover Cleveland", "Barack Obama", "John Adams", "David Flora", "social_sciences", "US Presidents", "This is a fun fact.");
        insertQuestion(db,"Ep1Question6", "What is the best selling video game console of all time?", "PlayStation 2", "Nintendo Wii", "Halcyon", "XBox 360", "technology", "computers", "Over 155 million consoles were sold.");
        insertQuestion(db,"Ep1Question7", "Who has more bones, cats or humans?", "Cats", "Humans", "Both", "Dogs", "math_and_science", "animals", "This is a fun fact.");
        insertQuestion(db,"Ep1Question8", "What cardinal direction is the Leaning Tower of Pisa leaning in and is also the direction that Treebeard enjoys walking in the movie The Two Towers?", "South", "North", "East", "West", "social_sciences", "geography", "Treebeard says \"I always like going South, somehow it feels like going downhill.\" and this line was ad-libed by John Rhys-Davies.");
        insertQuestion(db,"Ep1Question9", "Despite being canceled after one season, which Joss Whedon TV show had DVD copies brought to the International Space Station by American Astronaut Steven Ray Swanson and now is a permanent part of the space station's library?", "Firefly", "Buffy the Vampire Slayer", "24", "Star Wars", "media", "television", "This is a fun fact.");
        insertQuestion(db,"Ep1Question10", "Which classic dutch painter chose himself as one of his favorite subjects?", "Rembrandt van Rijn", "Vincent van Gogh", "Andy Warhol", "Pablo Picasso", "the_arts", "art", "He produced around 70 self portraits.");
        insertQuestion(db,"Ep1Question11", "Who was the first woman to be inducted into the Rock and Roll Hall of Fame?", "Aretha Franklin", "Katy Perry", "Meat Loaf", "Lady Gaga", "media", "music", "This is a fun fact.");
        insertQuestion(db,"Ep1Question12", "In which European country did the dish goulash originate?", "Hungary", "Poland", "Europe", "Germany", "society_culture", "food", "This is a fun fact.");
        insertQuestion(db,"Ep1Question13", "Who was the God of the Underworld in Egyptian mythology?", "Osiris", "Isis", "Ra", "Hades", "society_culture", "Mythology", "This is a fun fact.");
        insertQuestion(db,"Ep1Question14", "Which Williams sister has won more single titles in Tennis?", "Serena", "Venus", "Tied", "Franly", "sports", "sports", "Serena has won 72 titles and Venus has won 49. They have won 22 titles when playing doubles together, including 14 Grand Slam titles and 3 Olympic gold medals.");
        insertQuestion(db,"Ep1Question15", "Who is credited with the authorship of the fable \"the Tortoise and the Hare?\"", "Aesop", "Grimm", "Fredlin Frankerson", "Edgar Allen Poe", "the_arts", "literature", "This is a fun fact.");
        insertQuestion(db,"Ep1Question16", "The name of which North African city literally means White House?", "Casablanca", "Alexandria", "Berlin", "Johannesburg", "social_sciences", "Language Arts", "This is a fun fact.");
        insertQuestion(db,"Ep2Question1","Which writer was commissioned by President Bill Clinton for his 1993 inauguration?","Maya Angelou","Stephen King","William Shakespeare","Freddie Mercury","the_arts","literature","The poem was called \"On the Pulse of the Morning\"");
        insertQuestion(db,"Ep2Question2","What name is given to the burrowing crustacean with an enlarged claw that it holds like a violin?","Fiddler Crab","Hermit Crab","Viola","Whale Shark","math_science","animals","This is a fun fact.");
        insertQuestion(db,"Ep2Question3","What automaker bought Rolls-Royce in 1998?","Volkswagen","Ford","Boeing","Mitsubishi","technology","automobiles","This is a fun fact.");
        insertQuestion(db,"Ep2Question4","What canyon is the Hoover Dam built in?","Black Canyon","Grand Canyon","Rotti Largo Canyon","Pacific Ocean","social_sciences","geography","This is a fun fact.");
        insertQuestion(db,"Ep2Question5","The atomic number in the periodic table refers to the number of what in an atom?","Protons","Neutrons","Electrons","Cats","math_science","chemistry","This is a fun fact.");
        insertQuestion(db,"Ep2Question6","In which South American Country was Che Guevara shot and killed?","Bolivia","Antarctica","Ecuador","Argentina","social_sciences","history","This is a fun fact.");
        insertQuestion(db,"Ep2Question7","Which country is more than half of the western coastline of South America?","Chile","Brazil","Argentina","Ecuador","social_sciences","geography","This is a fun fact.");
        insertQuestion(db,"Ep2Question8","Which golfer holds the PGA record for most runner-up finishes in the majors?","Jack Nicklaus","Tiger Woods","Jimmy Neutron","Tony Hawk","sports","golf","He has 19, to go along 18 wins.");
        insertQuestion(db,"Ep2Question9","Which actor was both one of the \"The Dirty Dozen\" and \"The Magnificent Seven\"?","Charles Bronson","Tom Cruise","Adam Sandler","Fred Astaire","media","film","This is a fun fact.");
        insertQuestion(db,"Ep2Question10","A Cephalophore is an artistic depiction of a saint holding what?","Their own head","Cats","A Bible","Baby Jesus","the_arts","art","It's a symbol of their martyrdom.");
        insertQuestion(db,"Ep2Question11","What 2 letters are you supposed to mind when someone tells you to be on your best behavior?","Ps and Qs","As and Bs","Is and Ts","Zs and Ws","social_sciences","language arts","This is a fun fact.");
        insertQuestion(db,"Ep2Question12","Which bone connects the ribs together?","Sternum","Tibia","Medulla Oblongata","Tailbone","math_science","anatomy","This is a fun fact.");
        insertQuestion(db,"Ep2Question13","Albert Lamorisse, the French Filmmaker who directed the classic short \"The Red Balloon\" also invented what strategy based board game in 1957?","Risk","Monopoly","Candy Land","Sorry!","games_hobbies","board games","This is a fun fact.");
        insertQuestion(db,"Ep2Question14","Which US State is associated with whiskey and is the home of the Jack Daniels distellery in Lynchburg?","Tennessee","Kentucky","Alaska","Texas","society_culture","food/drink","This is a fun fact.");
        insertQuestion(db,"Ep2Question15","What does ESPN stand for?","Entertainment and Sports Programming Network","Even Sports Paint Nudes","Epilepsy Sucks, Pay Me","Electronic Sports Photography Network","media","television","This is a fun fact.");
        insertQuestion(db,"Ep2Question16","Which small, adorable dog breed derives its name from where it is thought to originate in the Mediterranean Island Nation of Malta?","Maltese","Poodle","Chihuahua","Staffordshire Terrier","math_science","animals","Ezzie is a Maltese.");
        insertQuestion(db,"Ep3Question1","Which sequel directed by Steven Spielberg had forboding tagline: \"Something has survived\"?","Jurassic Park: The Lost World","Jaws 2","Saw 2","Dumbo","media","film","This is a fun fact.");
        insertQuestion(db,"Ep3Question2","Which President got a new bathtub for the White House that was so large it could hold four average-size men?","Taft","Eisenhower","Bush","Kennedy","social_sciences","US Presidents","He weighed 330 pounds");
        insertQuestion(db,"Ep3Question3","Who did Mehmet Ali Agca attempt to assassinate in 1981?","Pope John Paul II","John F. Kennedy","Angela Lansbury","Sandra Day O'Connor","social_sciences","history","This is a fun fact.");
        insertQuestion(db,"Ep3Question4","Only 2 kinds of mammals currently lay eggs. Name either of them.","Platypus and Echidna","Cat and Dog","Dolphin and Platypus","Wyvern and Garter Snake","math_science","animals","None");
        insertQuestion(db,"Ep3Question5","Which American City is the game monoply based on sharing streets like Boradwalk and Marvin Gardens?","Atlantic City","New York City","Albuquerque","Boston","games_hobbies","board games","None");
        insertQuestion(db,"Ep3Question6","What common household liquid is mostly made of dilute acetic acid?","Vinegar","baking soda","salt","bleach","math_science","chemistry","None");
        insertQuestion(db,"Ep3Question7","Which two golfers have won a Career Grand Slam (all four of golf's modern majors) at least three times?","Jack Nicklaus and Tiger Woods","Tiger Woods and Jeff Goldbloom","Jack Nicklaus and Jack Nicholas","Tom Cruise and Benedict Cumberbatch","sports","golf","This is a fun fact.");
        insertQuestion(db,"Ep3Question8","Thousand Island Dressing got its name from the Thousand Islands of what river along the border of US and Canada?","St Lawrence River","Amazon River","Nile River","Mississippi River","social_sciences","geography","This is a fun fact.");
        insertQuestion(db,"Ep3Question9","What is the medical term for your big toe?","Hallux","Humerus","Plantar Fasciia","Foot","math_science","anatomy","None");
        insertQuestion(db,"Ep3Question10","Which songwriting Trumpeter has the title 'Father of the Blues'?","W. C. Handy","Ray Charles","Billy Joel","Freddie Mercury","media","music","None");
        insertQuestion(db,"Ep3Question11","Promoted as a Swiss national dish in the 1930s and popularized in America in the 1960s, which dish comes from a French word meaning 'to melt'?","Fondue","Waffle","Goulash","Meltar","society_culture","food/drink","None");
        insertQuestion(db,"Ep3Question12","Which surrealist painted the work \"The persistence of memory\"?","Salvador Dali","Pablo Picasso","Ezzie Flora","Andy Warhol","the_arts","art","None");
        insertQuestion(db,"Ep3Question13","What was the name of the test project that produced the first nuclear explosion which took place in 1945 in New Mexico?","Trinity","Albuquerque","Repo","Desert Storm","math_science","science","It took place in the Jornada del Muerto (Journey of Death) Desert");
        insertQuestion(db,"Ep3Question14","Benazir Bhutto was the first female leader of which country?","Pakistan","Spain","Italy","Egypt","social_sciences","world politics","She was the first woman to head a democratic government in a Muslim majority nation.");
        insertQuestion(db,"Ep3Question15","What patriotically titled album was the first CD ever made in the United States?","Born in the USA - Bruce Springsteen","USA IS AWESOME - America","This is America - Billy Joel","Patriotic - Queen","media","music","None");
        insertQuestion(db,"Ep3Question16","Which planet is farthest from Earth: Mars or Venus?","Venus","Mars","Equidistant","Pluto","math_science","space","Mars is 54.6 million kilometers away and Venus is 261 million kilometers away");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private static void insertQuestion(SQLiteDatabase db, String name, String theQuestion,
                                       String realAnswer, String fakeAnswer1, String fakeAnswer2, String fakeAnswer3,
                                       String category, String subcategory, String funFact){
        ContentValues questionValues = new ContentValues();
        questionValues.put("NAME", name);
        questionValues.put("THEQUESTION", theQuestion);
        questionValues.put("REALANSWER", realAnswer);
        questionValues.put("FAKEANSWER1", fakeAnswer1);
        questionValues.put("FAKEANSWER2", fakeAnswer2);
        questionValues.put("FAKEANSWER3", fakeAnswer3);
        questionValues.put("CATEGORY", category);
        questionValues.put("SUBCATEGORY", subcategory);
        questionValues.put("FUNFACT", funFact);
        db.insert("QUESTION", null, questionValues);
    }
}
