package com.drijks.quizquizbangbangtrivia;
import com.drijks.quizquizbangbangtrivia.Model.Question;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class QuestionData {
    public static Question pickRandomQ() {
        Random r = new Random();
        return data2.get(r.nextInt(data2.size()));
    }

    public static List<Question> pickTenRandom() {
        List<Question> copy = new LinkedList<Question>(data2);
        Collections.shuffle(copy);
        return copy.subList(0,10);
    }

    public static List<Question> pickFromCategory(String category) {
        ArrayList<Question> copy = new ArrayList<Question>();
        for (int i = 0; i < data2.size(); i++) {
            if (category.equals(data2.get(i).getCategory())) {
                copy.add(data2.get(i));
            }
        }
        List<Question> newCopy = new LinkedList<Question>(copy);
        Collections.shuffle(newCopy);
        return newCopy.subList(0,10);
    }


    public static final ArrayList<Question> data2 = buildData();

    public static Question retrieveQuestion(String qName){
        for (int i = 0; i < data2.size(); i++){
            if (qName.equals(data2.get(i).getName())){
                return data2.get(i);
            }
        }
        return null;
    }

    private static ArrayList<Question> buildData(){
        ArrayList<Question> data2 = new ArrayList<>();

        Question q1 = new Question("Question1", "What is the nautical term for stop?", "Avast", "Belay", "Man Overboard!", "Stop", "technology", "Transport", "Avast, ye swine!");
        data2.add(q1);

        Question q2 = new Question("Question2", "How many bits are in a byte?", "8", "A billion", "100", "16", "technology", "none", "Bits and bytes are needed for computers to run.");
        data2.add(q2);

        Question q3 = new Question("Question3", "What Author of Mastering the Art of French Cooking did Merryl Streep portray in a 2009 film?", "Julia Child", "Betty Crocker", "Martha Stewart", "Christine LeCook", "media", "film","Food is yummy.");
        data2.add(q3);

        Question q4 = new Question("Question4", "The Second Vatican Council, better known as Vatican II, began in what year?", "1962", "1956", "1894", "1945", "society_culture", "religion", "Genuflect, genuflect, genuflect");
        data2.add(q4);

        Question q5 = new Question("Question5", "Which American Novelist, who wrote 89 novels, loved to refer to the genre he did the most as frontier stories?", "Louis LAmour", "Dean Koontz", "Jackie Chan", "Lemony Snicket", "the_arts", "literature", "Reading is fun!");
        data2.add(q5);


        Question q6 = new Question("Question6", "British Admiral Horatio Nelson was one of the casualties when Britain defeated the combined French and Spanish navies off the coast of Spain in what 1805 naval engagement?", "Battle of Trafalgar", "Thirty Years War", "Battle of Tripoli", "Battle of Whiterun", "social_sciences", "history", "Whiterun is a place in Skyrim.");
        data2.add(q6);

        Question q7 = new Question("Question7", "Who was the first person to fly in space?", "Yuri Garagin", "Neil Armstrong", "The Space Core", "Michael Jordan", "math_and_science", "space", "SPAAAAAAAAAACE");
        data2.add(q7);

        Question q8 = new Question("Question8", "What is the name of the river which runs through Rome?", "Tiber", "Rhein", "Euphrates", "Amazon", "social_sciences", "geography", "Waterfalls!");
        data2.add(q8);

        Question q9 = new Question("Question9", "My high school art classroom had a poster of which famous artist whose mustache was fantastic?", "Salvador Dali", "Andy Warhol", "Esmeralda Flora", "Freddie Mercury", "the_arts", "art", "HE STARED INTO YOUR SOUL");
        data2.add(q9);

        Question q10 = new Question("Question10", "What is the legendary Pokemon you capture in Pokemon White Version?", "Zekrom", "Reshiram", "Zygarde", "Pikachu", "games_hobbies", "pokemon", "Gotta catch 'em all!");
        data2.add(q10);

        Question e1q1 = new Question("Ep1Question1", "Appointed in 1981 by President Ronald Reagan, who was the first woman to serve on the Supreme Court?", "Sandra Day O'Connor", "\"Harriet Tubman", "Bram Stoker", "Oprah Winfrey", "social_sciences", "politics", "This is a fun fact.");
        data2.add(e1q1);

        Question e1q2 = new Question("Ep1Question2", "Released in 1939 and nominated for 13 Oscars, which was the first movie in color to win an Academy Award?", "Gone With the Wind", "Star Wars", "Harry Potter", "The Wizard of Oz", "media", "film", "This is a fun fact.");
        data2.add(e1q2);

        Question e1q3 = new Question("Ep1Question3", "The letter \"Q\" does not appear in any official element names on the periodic table, however temporary element names such as ununquadium contain this letter. Which letter does not appear on the periodic table at all?", "J", "K", "A", "F", "math_and_science", "chemistry", "This is a fun fact.");
        data2.add(e1q3);

        Question e1q4 = new Question("Ep1Question4", "Which country was the first to win the World Cup?", "Uruguay", "Spain", "Germany", "France", "sports", "sports", "This is a fun fact.");
        data2.add(e1q4);

        Question e1q5 = new Question("Ep1Question5", "Who was the only president to serve two non-consecutive terms?", "Grover Cleveland", "Barack Obama", "John Adams", "David Flora", "social_sciences", "US Presidents", "This is a fun fact.");
        data2.add(e1q5);

        Question e1q6 = new Question("Ep1Question6", "What is the best selling video game console of all time?", "PlayStation 2", "Nintendo Wii", "Halcyon", "XBox 360", "technology", "computers", "Over 155 million consoles were sold.");
        data2.add(e1q6);

        Question e1q7 = new Question("Ep1Question7", "Who has more bones, cats or humans?", "Cats", "Humans", "Both", "Dogs", "math_and_science", "animals", "This is a fun fact.");
        data2.add(e1q7);

        Question e1q8 = new Question("Ep1Question8", "What cardinal direction is the Leaning Tower of Pisa leaning in and is also the direction that Treebeard enjoys walking in the movie The Two Towers?", "South", "North", "East", "West", "social_sciences", "geography", "Treebeard says \"I always like going South, somehow it feels like going downhill.\" and this line was ad-libed by John Rhys-Davies.");
        data2.add(e1q8);


        Question e1q9 = new Question("Ep1Question9", "Despite being canceled after one season, which Joss Whedon TV show had DVD copies brought to the International Space Station by American Astronaut Steven Ray Swanson and now is a permanent part of the space station's library?", "Firefly", "Buffy the Vampire Slayer", "24", "Star Wars", "media", "television", "This is a fun fact.");
        data2.add(e1q9);

        Question e1q10 = new Question("Ep1Question10", "Which classic dutch painter chose himself as one of his favorite subjects?", "Rembrandt van Rijn", "Vincent van Gogh", "Andy Warhol", "Pablo Picasso", "the_arts", "art", "He produced around 70 self portraits.");
        data2.add(e1q10);


        Question e1q11 = new Question("Ep1Question11", "Who was the first woman to be inducted into the Rock and Roll Hall of Fame?", "Aretha Franklin", "Katy Perry", "Meat Loaf", "Lady Gaga", "media", "music", "This is a fun fact.");
        data2.add(e1q11);

        Question e1q12 = new Question("Ep1Question12", "In which European country did the dish goulash originate?", "Hungary", "Poland", "Europe", "Germany", "society_culture", "food", "This is a fun fact.");
        data2.add(e1q12);


        Question e1q13 = new Question("Ep1Question13", "Who was the God of the Underworld in Egyptian mythology?", "Osiris", "Isis", "Ra", "Hades", "society_culture", "Mythology", "This is a fun fact.");
        data2.add(e1q13);

        Question e1q14 = new Question("Ep1Question14", "Which Williams sister has won more single titles in Tennis?", "Serena", "Venus", "Tied", "Franly", "sports", "sports", "Serena has won 72 titles and Venus has won 49. They have won 22 titles when playing doubles together, including 14 Grand Slam titles and 3 Olympic gold medals.");
        data2.add(e1q14);

        Question e1q15 = new Question("Ep1Question15", "Who is credited with the authorship of the fable \"the Tortoise and the Hare?\"", "Aesop", "Grimm", "Fredlin Frankerson", "Edgar Allen Poe", "the_arts", "literature", "This is a fun fact.");
        data2.add(e1q15);

        Question e1q16 = new Question("Ep1Question16", "The name of which North African city literally means White House?", "Casablanca", "Alexandria", "Berlin", "Johannesburg", "social_sciences", "Language Arts", "This is a fun fact.");
        data2.add(e1q16);

        Question e1q17 = new Question("Ep1BigBang1","What is the name of the battle that took place in Belgium on June, 18 1815 that marked the final defeat of Napoleon Bonaparte?", "Waterloo", "Solitude", "Tripoli", "Liechtenstein", "social_sciences", "history", "This is a fun fact.");
        data2.add(e1q17);

        Question e1q18 = new Question("Ep1BigBang2","A Morse Code distress signal that was introduced by Germany in 1905 is more commonly known as what?","S.O.S.","ASAP","IDKLOL","HALP","technology","communication","This is a fun fact.");
        data2.add(e1q18);

        Question e1q19 = new Question("Ep1BigBang3","Pierce Brosnan, Meryl Streep and Amanda Seyfried starred in what 2008 movie?","Mamma Mia","Goldeneye","Remington Steele","Enchanted","media","film","This is a fun fact.");
        data2.add(e1q19);

        Question e1q20 = new Question("Ep1FinalQuestion","Which band won Eurovision in 1974, also marking the first win for the country it represented?","Abba","The Beatles","Blink 182","The Aquabats!","media","music","This is a fun fact.");
        data2.add(e1q20);

        Question e2q1 = new Question("Ep2Question1","Which writer was commissioned by President Bill Clinton for his 1993 inauguration?","Maya Angelou","Stephen King","William Shakespeare","Freddie Mercury","the_arts","literature","The poem was called \"On the Pulse of the Morning\"");
        data2.add(e2q1);

        Question e2q2 = new Question("Ep2Question2","What name is given to the burrowing crustacean with an enlarged claw that it holds like a violin?","Fiddler Crab","Hermit Crab","Viola","Whale Shark","math_science","animals","This is a fun fact.");
        data2.add(e2q2);

        Question e2q3 = new Question("Ep2Question3","What automaker bought Rolls-Royce in 1998?","Volkswagen","Ford","Boeing","Mitsubishi","technology","automobiles","This is a fun fact.");
        data2.add(e2q3);

        Question e2q4 = new Question("Ep2Question4","What canyon is the Hoover Dam built in?","Black Canyon","Grand Canyon","Rotti Largo Canyon","Pacific Ocean","social_sciences","geography","This is a fun fact.");
        data2.add(e2q4);

        Question e2q5 = new Question("Ep2Question5","The atomic number in the periodic table refers to the number of what in an atom?","Protons","Neutrons","Electrons","Cats","math_science","chemistry","This is a fun fact.");
        data2.add(e2q5);

        Question e2q6 = new Question("Ep2Question6","In which South American Country was Che Guevara shot and killed?","Bolivia","Antarctica","Ecuador","Argentina","social_sciences","history","This is a fun fact.");
        data2.add(e2q6);

        Question e2q7 = new Question("Ep2Question7","Which country is more than half of the western coastline of South America?","Chile","Brazil","Argentina","Ecuador","social_sciences","geography","This is a fun fact.");
        data2.add(e2q7);

        Question e2q8 = new Question("Ep2Question8","Which golfer holds the PGA record for most runner-up finishes in the majors?","Jack Nicklaus","Tiger Woods","Jimmy Neutron","Tony Hawk","sports","golf","He has 19, to go along 18 wins.");
        data2.add(e2q8);

        Question e2q9 = new Question("Ep2Question9","Which actor was both one of the \"The Dirty Dozen\" and \"The Magnificent Seven\"?","Charles Bronson","Tom Cruise","Adam Sandler","Fred Astaire","media","film","This is a fun fact.");
        data2.add(e2q9);

        Question e2q10 = new Question("Ep2Question10","A Cephalophore is an artistic depiction of a saint holding what?","Their own head","Cats","A Bible","Baby Jesus","the_arts","art","It's a symbol of their martyrdom.");
        data2.add(e2q10);

        Question e2q11 = new Question("Ep2Question11","What 2 letters are you supposed to mind when someone tells you to be on your best behavior?","Ps and Qs","As and Bs","Is and Ts","Zs and Ws","social_sciences","language arts","This is a fun fact.");
        data2.add(e2q11);

        Question e2q12 = new Question("Ep2Question12","Which bone connects the ribs together?","Sternum","Tibia","Medulla Oblongata","Tailbone","math_science","anatomy","This is a fun fact.");
        data2.add(e2q12);

        Question e2q13 = new Question("Ep2Question13","Albert Lamorisse, the French Filmmaker who directed the classic short \"The Red Balloon\" also invented what strategy based board game in 1957?","Risk","Monopoly","Candy Land","Sorry!","games_hobbies","board games","This is a fun fact.");
        data2.add(e2q13);

        Question e2q14 = new Question("Ep2Question14","Which US State is associated with whiskey and is the home of the Jack Daniels distellery in Lynchburg?","Tennessee","Kentucky","Alaska","Texas","society_culture","food/drink","This is a fun fact.");
        data2.add(e2q14);

        Question e2q15 = new Question("Ep2Question15","What does ESPN stand for?","Entertainment and Sports Programming Network","Even Sports Paint Nudes","Epilepsy Sucks, Pay Me","Electronic Sports Photography Network","media","television","This is a fun fact.");
        data2.add(e2q15);

        Question e2q16 = new Question("Ep2Question16","Which small, adorable dog breed derives its name from where it is thought to originate in the Mediterranean Island Nation of Malta?","Maltese","Poodle","Chihuahua","Staffordshire Terrier","math_science","animals","Ezzie is a Maltese.");
        data2.add(e2q16);

        Question e2q17 = new Question("Ep2BigBang1","What sinister fictional character was known as the 'demon barber of Fleet Street?'","Sweeney Todd","Jack the Ripper","Harry Potter","Dracula","media","film","This is a fun fact.");
        data2.add(e2q17);

        Question e2q18 = new Question("Ep2BigBang2","What infamous Russian mystic was nicknamed the 'mad monk?'","Rasputin","Boney M","Anastasia","Joseph Stalin","social_sciences","history","This is a fun fact.");
        data2.add(e2q18);

        Question e2q19 = new Question("Ep2BigBang3","May 25th is towel day which celebrates Douglas Adams and which comedy sci-fi series?","Hitchhiker's Guide to the Galaxy","A Series of Unfortunate Events","Jimmy Hendrix","Cats","media","idklol","This is a fun fact.");
        data2.add(e2q19);

        Question e2q20 = new Question("Ep2FinalQuestion","What actor was given his role in the Harry Potter films after the part was turned down by Tim Roth?","Alan Rickman","Jeff Goldblum","David Hasselhoff","George Clooney","media","film","He was given secret intel");
        data2.add(e2q20);


        Question e3q1 = new Question("Ep3Question1","Which sequel directed by Steven Spielberg had forboding tagline: \"Something has survived\"?","Jurassic Park: The Lost World","Jaws 2","Saw 2","Dumbo","media","film","This is a fun fact.");
        data2.add(e3q1);

        Question e3q2 = new Question("Ep3Question2","Which President got a new bathtub for the White House that was so large it could hold four average-size men?","Taft","Eisenhower","Bush","Kennedy","social_sciences","US Presidents","He weighed 330 pounds");
        data2.add(e3q2);

        Question e3q3 = new Question("Ep3Question3","Who did Mehmet Ali Agca attempt to assassinate in 1981?","Pope John Paul II","John F. Kennedy","Angela Lansbury","Sandra Day O'Connor","social_sciences","history","This is a fun fact.");
        data2.add(e3q3);

        Question e3q4 = new Question("Ep3Question4","Only 2 kinds of mammals currently lay eggs. Name either of them.","Platypus and Echidna","Cat and Dog","Dolphin and Platypus","Wyvern and Garter Snake","math_science","animals","None");
        data2.add(e3q4);

        Question e3q5 = new Question("Ep3Question5","Which American City is the game monoply based on sharing streets like Boradwalk and Marvin Gardens?","Atlantic City","New York City","Albuquerque","Boston","games_hobbies","board games","None");
        data2.add(e3q5);

        Question e3q6 = new Question("Ep3Question6","What common household liquid is mostly made of dilute acetic acid?","Vinegar","baking soda","salt","bleach","math_science","chemistry","None");
        data2.add(e3q6);

        Question e3q7 = new Question("Ep3Question7","Which two golfers have won a Career Grand Slam (all four of golf's modern majors) at least three times?","Jack Nicklaus and Tiger Woods","Tiger Woods and Jeff Goldbloom","Jack Nicklaus and Jack Nicholas","Tom Cruise and Benedict Cumberbatch","sports","golf","This is a fun fact.");
        data2.add(e3q7);

        Question e3q8 = new Question("Ep3Question8","Thousand Island Dressing got its name from the Thousand Islands of what river along the border of US and Canada?","St Lawrence River","Amazon River","Nile River","Mississippi River","social_sciences","geography","This is a fun fact.");
        data2.add(e3q8);

        Question e3q9 = new Question("Ep3Question9","What is the medical term for your big toe?","Hallux","Humerus","Plantar Fasciia","Foot","math_science","anatomy","None");
        data2.add(e3q9);

        Question e3q10 = new Question("Ep3Question10","Which songwriting Trumpeter has the title 'Father of the Blues'?","W. C. Handy","Ray Charles","Billy Joel","Freddie Mercury","media","music","None");
        data2.add(e3q10);

        Question e3q11 = new Question("Ep3Question11","Promoted as a Swiss national dish in the 1930s and popularized in America in the 1960s, which dish comes from a French word meaning 'to melt'?","Fondue","Waffle","Goulash","Meltar","society_culture","food/drink","None");
        data2.add(e3q11);

        Question e3q12 = new Question("Ep3Question12","Which surrealist painted the work \"The persistence of memory\"?","Salvador Dali","Pablo Picasso","Ezzie Flora","Andy Warhol","the_arts","art","None");
        data2.add(e3q12);

        Question e3q13 = new Question("Ep3Question13","What was the name of the test project that produced the first nuclear explosion which took place in 1945 in New Mexico?","Trinity","Albuquerque","Repo","Desert Storm","math_science","science","It took place in the Jornada del Muerto (Journey of Death) Desert");
        data2.add(e3q13);

        Question e3q14 = new Question("Ep3Question14","Benazir Bhutto was the first female leader of which country?","Pakistan","Spain","Italy","Egypt","social_sciences","world politics","She was the first woman to head a democratic government in a Muslim majority nation.");
        data2.add(e3q14);

        Question e3q15 = new Question("Ep3Question15","What patriotically titled album was the first CD ever made in the United States?","Born in the USA - Bruce Springsteen","USA IS AWESOME - America","This is America - Billy Joel","Patriotic - Queen","media","music","None");
        data2.add(e3q15);

        Question e3q16 = new Question("Ep3Question16","Which planet is farthest from Earth: Mars or Venus?","Venus","Mars","Equidistant","Pluto","math_science","space","Mars is 54.6 million kilometers away and Venus is 261 million kilometers away");
        data2.add(e3q16);

        Question e3q17 = new Question("Ep3BigBang1","Tessellation is the covering of a surface with no gaps or overlaps using geometric shapes of what simple construction objects, often used for floors, showers, and decoration?","Tiles","Snowflakes","Carpet","Hardwood Flooring","society_culture","design","This is a fun fact.");
        data2.add(e3q17);

        Question e3q18 = new Question("Ep3BigBang2","Usually done in a formal or elegant style, what type of writing composition is an epistle?","Letter","Sonnet","Telegram","Soliloquy","the_arts","literature","This is a fun fact.");
        data2.add(e3q18);

        Question e3q19 = new Question("Ep3BigBang3","Though the honor of which was 'the world’s first' is debated, it’s generally accepted that the Dec. 21, 1913 edition of the New York World newspaper printed the first of what type of puzzle?","Crossword","Sudoku","Jigsaw","Logic Problem","games_hobbies","puzzles","This is a fun fact.");
        data2.add(e3q19);

        Question e3q20 = new Question("Ep3FinalQuestion","Created in 1938 by NYC architect Alfred Butts, what board game has an anagram variation called “Clabbers?”","Scrabble","Sorry!","Solitaire","Doom","games_hobbies","board games","This is a fun fact.");
        data2.add(e3q20);

        Question e4q1 = new Question("Ep4Question1","This fictional character was created by Robert Bloch and resembled Ed Gein 'The Butcher of Plainfield'. Anthony Perkins performed the role of this character in one of Alfred's Hitchcock's movies. What is this character's name?","Norman Bates","Charles Manson","Your Mom","Doogie Howser","media","fictional characters","Although it was thought that Robert Bloch was inspired by Ed Gein, he said he was already finished with the book when he became aware of his existence.");
        data2.add(e4q1);

        Question e4q2 = new Question("Ep4Question2","Much to the chagrin of its brick-walled buildings, what is Nebraska's official state soft drink?","Kool-Aid","Sprite","Coca-Cola","Mr. Pibb","society_culture","food/drink","Kool-Aid was developed in Hastings, NE in 1927");
        data2.add(e4q2);

        Question e4q3 = new Question("Ep4Question3","For the website 'imdb.com' what do the letters imdb stand for?","Internet Movie Database","I Make Dogs Bite","Internet Movies Don't Play","Internet Media Database","technology","internet","This is a fun fact.");
        data2.add(e4q3);

        Question e4q4 = new Question("Ep4Question4","There were two men that worked as indentured servants in their boyhoods who would go on to become US Presidents. Name either of them.","Andrew Johnson and Millard Fillmore","Andrew Jackson and George Washington","Barack Obama and George H.W. Bush","Richard Nixon and Abraham Lincoln","social_sciences","US Presidents","This is a fun fact.");
        data2.add(e4q4);

        Question e4q5 = new Question("Ep4Question5","'The Red Vineyard' is believed to be the only painting sold during which painter's lifetime?","Vincent Van Gogh","Banksy","Pablo Picasso","Andy Warhol","the_arts","art","This is a fun fact.");
        data2.add(e4q5);

        Question e4q6 = new Question("Ep4Question6","This multi talented actor who started his acting in television and transitioned to movies is the only actor to have eight consecutive films gross over $100 million in domestic box office sales and the streak ended in 2008, who is he?","Will Smith","Tom Cruise","Idris Elba","Johnny Depp","media","film","He is the only actor in history to have eight consecutive films gross over $100 million in domestic box office sales.");
        data2.add(e4q6);


        Question e4q7 = new Question("Ep4Question7","Located in the brain, what gland is the smallest organ in the human body?","Pineal Gland","Pituitary Gland","Canis Gland","Dogbutt Gland","math_and_science","anatomy","This is a fun fact.");
        data2.add(e4q7);

        Question e4q8 = new Question("Ep4Question8","What Canadian City is home to the graves of the unclaimed bodies of those who died when the titanic sank? (due to its close proximity)","Hallifax, Nova Scotia","Albany, New York","Albuquerque, New Mexico","Dublin, Ireland","social_sciences","geography","This is a fun fact.");
        data2.add(e4q8);

        Question e4q9 = new Question("Ep4Question9","Within 2 years, in what year was the world's first woman Prime Minister elected?","1960","1972","1869","2014","social_sciences","world leaders","Sirima Ratwatte Dias Bandaranaike was the first female Prime Minister of Sri Lanka");
        data2.add(e4q9);

        Question e4q10 = new Question("Ep4Question10","The name of this currency literally translates to 'weight' and is used in multiple Spanish speaking countries like Argentina, Chile, Columbia, Cuba, Mexico and Uruguay. What is name of this currency?","Peso","Euro","Pound","Kilogram","social_sciences","currency","This is a fun fact.");
        data2.add(e4q10);

        Question e4q11 = new Question("Ep4Question11","Designed by Richard Garfield, what trading card game was first released by Wizards of the Coast in 1993?","Magic: the Gathering","Star Wars","Pokemon","World of Warcraft","games_hobbies","card_games","Apparently the name Magic was too generic for trademark, so it was almost called 'Mana Clash' but people kept calling it 'magic,' prompting Wizards of the Coast to add 'the gathering' so they could tademark the name more easily.");
        data2.add(e4q11);

        Question e4q12 = new Question("Ep4Question12","How many letters does the Hawaiian alphabet have?","13","26","4","50","social_sciences","language arts","A, E, H, I, K, L, M, N, O, P, U, W, and the 'okina, a guttaral stop, recognized as a letter since 1864.");
        data2.add(e4q12);

        Question e4q13 = new Question("Ep4Question13","The Zambezi River in Zimbabwe and Zambia form the world's largest waterfall, what is it called?","Victoria Falls","Niagara Falls","Virginia Falls","Lake Titicaca Falls","social_sciences","geography","This is a fun fact.");
        data2.add(e4q13);

        Question e4q14 = new Question("Ep4Question14","According to old folk tales, if you suffered from lycanthropy, what beast would you willingly or unwillingly be able to transform into?","Wolf (werewolf)","Bear (werebear)","Cat (werecat)","Beaver (werebeaver)","society_culture","folklore","Check out the Blurry Photos Podcast for cool werewolf facts!");
        data2.add(e4q14)
        ;
        Question e4q15 = new Question("Ep4Question15","With the symbol of At, which element is the rarest natural element on Earth?","Astatine","Gold","Silver","Adamantium","math_and_science","chemistry","This is a fun fact.");
        data2.add(e4q15);

        Question e4q16 = new Question("Ep4Question16","What athlete won 58 straight 400-meter races between 1989 and 1997?","Michael Johnson","Jog Mansen","River Runner","Stanley Kubrick","sports","track and field","This is a fun fact.");
        data2.add(e4q16);

        Question e4q17 = new Question("Ep4BigBang1","What type of sedimentary rock is composed mostly of naturally-cemented granules of quartz or feldspar?","Sandstone","Diorite","Andesite","Gravel","math_and_science","geology","This is a fun fact.");
        data2.add(e4q17);

        Question e4q18 = new Question("Ep4BigBang2","With around 900 million followers, what religion is the third largest in the world today?","Hinduism","Buddhism","Islam","Satanism","society_culture","religion","This is a fun fact.");
        data2.add(e4q18);

        Question e4q19 = new Question("Ep4BigBang3","Which country's flag is the only national flag in the world that has a specific building featured on it?","Cambodia","Argentina","Mexico","Belgium","social_sciences","flags","This is a fun fact.");
        data2.add(e4q19);

        Question e4q20 = new Question("Ep4FinalQuestion","Built to represent Mount Meru, home of the gods, what temple complex is the largest religious monument in the world?","Angkor Wat","The Dublin Spire","Notre Dame","Mount Rushmore","society_culture","famous landmarks","Originally a Hindu temple constructed mostly of sandstone, the building featured on Cambodia's flag is Angkor Wat");
        data2.add(e4q20);

        Question e5q1 = new Question("Ep5Question1","Who was the first person other than royalty to be portrayed on a British Stamp?","William Shakespeare","Henry Chaucer","Charlie Chaplin","Dick van Dyke","social_sciences","stamps","This is a fun fact.");
        data2.add(e5q1);

        Question e5q2 = new Question("Ep5Question2","Which album's cover had around 70 people on it, including Edgar Allen Poe, Bob Dylan and Carl Jung?","Sgt. Pepper's Lonely Hearts Club Band.","Abba's The Visitors","Meat Loaf's Bat Out of Hell","Amy Grant's A Christmas Album","media","music","Shirley Temple appears on the cover twice and as a third time as a doll.");
        data2.add(e5q2);

        Question e5q3 = new Question("Ep5Question3","What is the term for the study of fluids in motion and how they can be practically applied?", "Hydraulics","Hydrationology","Waterstry", "Physics","math_and_science", "science","This is a fun fact.");
        data2.add(e5q3);

        Question e5q4 = new Question("Ep5Question4","What expensive kind of beef is made from black wagyu bulls?","Kobe Beef","Beef Jerky","Sirloin Steak","Beefy Beef","society_culture","food/drink","This is a fun fact.");
        data2.add(e5q4);

        Question e5q5 = new Question("Ep5Question5","Who is the only NBA player to win the NBA MVP, Defensive Player of the Year, and Finals MVP in the same year, that being 1994?","Hakeem Olajuwon","Jeff Snyder","Michael Jordan","Tiger Woods", "sports","basketball","This is a fun fact.");
        data2.add(e5q5);

        Question e5q6 = new Question("Ep5Question6","What is the name of this common song many American Ice Cream Trucks play? [play clip]","Turkey in the Straw","Green Acres","Get Along Little Doggy","Yankee Doodle","media","music","Same tune as 'do your ears hang low?' In Britain it is Green Sleeves.");
        data2.add(e5q6);

        Question e5q7 = new Question("Ep5Question7","Which video game franchise has multiple installments centering around protaganists from the Belmont Clan?","Castlevania","The Elder Scrolls","Pokemon","The Legend of Zelda","games_hobbies","video games","This is a fun fact.");
        data2.add(e5q7);

        Question e5q8 = new Question("Ep5Question8","Caryn Johnson is a famous actor/comedienne and she is better known by what stage name, I bet you can get this answer in a Jumping Jack Flash?","Whoopi Goldberg","Kate Bush","Indiana Jones","Franklynna Frankie","media","film","Whoopie cushion/Jewish");
        data2.add(e5q8);

        Question e5q9 = new Question("Ep5Question9","The 1968 movie 'Bullitt has one of the most famous car chases in cinematic history. Name either of the two make/models of the cars in that chase.","Ford Mustang and Dodge Charger","Ford Mustang and Chevy Trailblazer","Subaru Outback and Volkswagen Beetle","Dodge Ram and Rolls-Royce Phantom","technology","automobiles","This is a fun fact.");
        data2.add(e5q9);

        Question e5q10 = new Question("Ep5Question10","What name does Robinson Crusoe call the man who becomes his friend and servant in Defoe's novel?","Friday","Diorite","Happy Slappy","Fishsticks","the_arts","literature","He finds him on a Friday.");
        data2.add(e5q10);

        Question e5q11 = new Question("Ep5Question11","What body of water supplies Israeli mudbaths with 'black peloid mud'?","The Dead Sea","The Red Sea","The Mediterranean Sea","The Black Sea","social_sciences","geography","This is a fun fact.");
        data2.add(e5q11);

        Question e5q12 = new Question("Ep5Question12","What is the term for mischievous spirit whose name translate to 'Noisy Ghost' in German?","Poltergeist","Lautgeist","Leviosanon","Schneapy","society_culture","folklore","This is a fun fact.");
        data2.add(e5q12);

        Question e5q13 = new Question("Ep5Question13","How many US Presidents were assassinated during Queen Victoria's reign?","2","5","0","16","social_sciences","US Presidents","Lincoln and Garfield. Interestingly her reign ended in 1901 and McKinley was assassinated in September of 1901.");
        data2.add(e5q13);

        Question e5q14 = new Question("Ep5Question14","Representing souls in purgatory, Jack-O-Lanterns, were originally not carved out of pumpkins but out of what other vegetable?","Turnips","Pumpkins","Cabbages","Carrots","society_culture","holidays/traditions","This is a fun fact.");
        data2.add(e5q14);

        Question e5q15 = new Question("Ep5Question15","Which biblical character was thrown into a Lion's Den?","Daniel","Moses","Paul","Herod","society_culture","religion","This is a fun fact.");
        data2.add(e5q15);

        Question e5q16 = new Question("Ep5Question16","Originally dubbed the 'Cape of Storms', the Southern Tip of Africa was renamed what by the King of Portugal?","Cape of Good Hope","Cape of Capes","Cape Cod","Cape of Fish","social_sciences","geography","Portugese explorer Barthalomew Dias originally named it Cape of Storms in 1487.");
        data2.add(e5q16);

        Question e5q17 = new Question("Ep5BigBang1","Perhaps the most famous kennel club dog show in the world was named after what hotel at Irving Place and 16th st. in NYC?","Westminister","Hilton","Best Western","Holiday Inn","society_culture","famous landmarks","This is a fun fact.");
        data2.add(e5q17);

        Question e5q18 = new Question("Ep5BigBang2","Two thirds of London's drinking water comes from resevoirs which collect water from what source?","River Thames","Atlantic Ocean","Bay of Pigs","Cape Cod","social_sciences","geography","This is a fun fact.");
        data2.add(e5q18);

        Question e5q19 = new Question("Ep5BigBang3","In the original Back to the Future, what did lightning strike on Nov. 12, 1955 at 10:04pm?","Clock tower","Marty's Hat","Mount Rushmore", "The DeLorean", "media","film","This is a fun fact.");
        data2.add(e5q19);

        Question e5q20 = new Question("Ep5FinalQuestion","Renamed the Elizabeth Tower in 2012, what iconic landmark is better known by the name of its 13.5 ton bell?","Big Ben","London Eye","Millenium Bridge","Tower of London","society_culture","famous landmarks","This is a fun fact.");
        data2.add(e5q20);

        Question e6q1 = new Question("Ep6Question1","On which vessel did Jason and the Argonauts sail in search of the golden fleece?","The Argo","The Titanic","The Castaway","The Oedipus", "society_culture", "mythology", "This is a fun fact.");
        data2.add(e6q1);

        Question e6q2 = new Question("Ep6Question2","What word comes from the french for wooden shoe as disgruntled french workers would throw their wooden clogs into machinery during the industrial revolution?","Sabotage","Catastrophe", "Fried Chicken", "Sadness", "social_sciences","history","A sabot is a French clog");
        data2.add(e6q2);

        Question e6q3 = new Question("Ep6Question3","Which is the largest country in Africa?", "Algeria", "Egypt", "France", "China", "social_sciences","geography", "This is a fun fact.");
        data2.add(e6q3);

        Question e6q4 = new Question("Ep6Question4", "Who is the current Prime Minister of New Zealand?", "Jacinda Ardern", "Hillary Clinton", "Angela Merkel", "Ezzie Flora", "social_sciences", "world leaders", "she made history by being the first World Leader at the United Nations to bring a baby.");
        data2.add(e6q4);

        Question e6q5 = new Question("Ep6Question5","What is the top number of a fraction called?", "Numerator", "Denominator", "Equalizer", "Derivative", "math_and_science", "math", "This is a fun fact.");
        data2.add(e6q5);

        Question e6q6 = new Question("Ep6Question6", "Who is the only Actor to win the Best Supporting Actor Oscar posthumously?", "Heath Ledger", "Tom Cruise", "Henry Ford", "Jane Fonda", "media", "film", "It was for his amazing performance as the Joker in the Dark Knight");
        data2.add(e6q6);

        Question e6q7 = new Question("Ep6Question7", "Which host has made it into the Guinness Book of World Records for the most episodes of a game show hosted?", "Alex Trebeck", "Drew Carey", "Regis Filbin", "Henry Fonda", "media", "television", "He won the record in 2014 and at the time he had answered 416,569 questions");
        data2.add(e6q7);

        Question e6q8 = new Question("Ep6Question8","What is the most abundant element in the human body (by weight)?", "Oxygen", "Nitrogen", "Carbon", "Adamantium", "math_and_science", "science", "Oxygen accounts for about 65% of a person's body mass. Carbon is next with about 18% and Hydrogen rounds out the top 3 at 9%.");
        data2.add(e6q8);

        Question e6q9 = new Question("Ep6Question9","Buffalo Trace, Elijah Craig, and Early Times are brands of what liquor?","Bourbon","Vodka", "Wine", "Whiskey", "society_culture", "food/drink", "This is a fun fact.");
        data2.add(e6q9);

        Question e6q10 = new Question("Ep6Question10","Which Pittsburgh Pirates player was the first Latin American player to be inducted in the National Basball Hall of Fame in 1973?", "Roberto Clemente", "Tippy Martinez", "Babe Ruth", "Jack Dawson", "sports", "baseball", "He was also the first Latin American player to help win a World Series as a starter, receive an NL MVP Award and to receive a World Series MVP Award.");
        data2.add(e6q10);

        Question e6q11 = new Question("Ep6Question11", "The name of this popular game is Swahili for 'build'?","Jenga", "Hungry Hungry Hippos", "Risk", "Monopoly", "games_hobbies", "games", "This is a fun fact.");
        data2.add(e6q11);

        Question e6q12 = new Question("Ep6Question12","Who was the first Beatle to release a solo album?", "George Harrison", "Paul McCartney", "John Lennon", "Ringo Starr", "media", "music", "The album was Wonderwall Music");
        data2.add(e6q12);

        Question e6q13 = new Question("Ep6Question13","Contrary to popular belief, George Washington didn't actually wear a powdered wig; all that hair was his. He did powder it white, however. What was his original hair color?","Red", "Black", "Brown", "Blonde", "social_sciences", "US Presidents", "This is a fun fact.");
        data2.add(e6q13);

        Question e6q14 = new Question("Ep6Question14","What is the official state sport of Maryland, we're guessing they enjoy it during the day but especially for knights?", "Jousting", "Baseball", "Horse Racing", "Cricket", "sports", "sports", "This is a fun fact.");
        data2.add(e6q14);

        Question e6q15 = new Question("Ep6Question15","To the nearest 5,000, how many quills does a porcupine have?","30,000","50,000","1,000","80,000","math_and_science","animals","This is a fun fact.");
        data2.add(e6q15);

        Question e6q16 = new Question("Ep6Question16","What tourist spot has the Great Hall of the People to its west, the National Museum of China to its east, and the mausoleum of Mao Zedong just south?","Tiananmen Square","Times Square","Great Wall of China","Big Ben", "society_culture", "famous landmarks", "This is a fun fact.");
        data2.add(e6q16);

        Question e6q17 = new Question("Ep6BigBang1","What is the name of Coldplay's signature song that was on their Second Album 'A Rush of Blood to the Head' and made Rolling Stone's top 500 songs of all time?", "Clocks", "Talk", "Yellow", "The Scientist", "media", "music", "This is a fun fact.");
        data2.add(e6q17);

        Question e6q18 = new Question("Ep6BigBang2","Built on the remains of Roman fortifications, the Alhambra is a palace and fortress built by Muhammed Ibn Yusuf in the 13th century, and is located in what European country?", "Spain", "Germany", "Italy", "Poland", "society_culture", "famous landmarks", "This is a fun fact.");
        data2.add(e6q18);

        Question e6q19 = new Question("Ep6BigBang3","Which artistic movement developed out of Dadaism right after WWI?", "Surrealism", "Modernism", "Doodooism", "Realism", "the_arts", "art", "This is a fun fact.");
        data2.add(e6q19);

        Question e6q20 = new Question("Ep6FinalQuestion","In 1939, French writer and poet Andre Breton coined the derogatory nickname 'Avida Dollars,' a phonetic rendering of the French phrase meaning 'eager for dollars,' for which 20th century painter?", "Salvador Dali", "Pablo Picasso", "Andy Warhol", "Ezzie Flora", "the_arts", "art", "Born in Spain and famous for his surrealist paintings including The Persistence of Memory, with the melting watches, Avida Dollars was also an anagram of Salvador Dali.");
        data2.add(e6q20);

        Question dq1 = new Question("DummyQuestion1", "What is a computer?", "A computer", "A box", "A way of life", "A dead rat", "technology", "computers", "This is a fun fact.");
        data2.add(dq1);

        Question dq2 = new Question("DummyQuestion2", "What is an Arduino?", "A computer", "A box", "A way of life", "A dead rat", "technology", "computers", "This is a fun fact.");
        data2.add(dq2);

        Question dq3 = new Question("DummyQuestion3", "What is a keyboard?", "A keyboard", "A computer", "A way of life", "A dead rat", "technology", "computers", "This is a fun fact.");
        data2.add(dq3);

        Question dq4 = new Question("DummyQuestion4", "What is a mouse?", "A clicky thing", "A computer", "A dead rat", "An alive mouse", "technology", "computers", "This is a fun fact.");
        data2.add(dq4);

        Question dq5 = new Question("DummyQuestion5", "What is Windows?", "An operating system", "A computer", "A graphics card", "A clear pane of glass", "technology", "computers", "This is a fun fact.");
        data2.add(dq5);

        Question dq6 = new Question("DummyQuestion6", "What does VR stand for?", "Virtual Reality", "Vampire Reunion", "Virtual Rewards", "Vladimir Rutin", "technology", "computers", "This is a fun fact.");
        data2.add(dq6);

        Question dq7 = new Question("DummyQuestion7", "What company doesn't make cars?", "Walmart", "Ford", "Honda", "Hyundai", "technology", "automobiles", "This is a fun fact.");
        data2.add(dq7);

        Question dq8 = new Question("DummyQuestion8", "What shape is a basketball?", "Round", "Square", "Triangular", "Flat", "sports", "basketball", "This is a fun fact.");
        data2.add(dq8);

        Question dq9 = new Question("DummyQuestion9", "What shape is a tennis ball?", "Round", "Square", "Egg", "Pyramid", "sports", "tennis", "This is a fun fact.");
        data2.add(dq9);

        Question dq10 = new Question("DummyQuestion10", "What sport doesn't have a round ball?", "Football", "Tennis", "Baseball", "Soccer", "sports", "sports", "This is a fun fact.");
        data2.add(dq10);

        Question dq11 = new Question("DummyQuestion11", "What franchise is Midna from?", "Legend of Zelda", "Mario", "Pokemon", "Elder Scrolls", "games_hobbies", "video games", "This is a fun fact.");
        data2.add(dq11);

        Question dq12 = new Question("DummyQuestion12", "What franchise is the Master Sword from?", "Legend of Zelda", "Mario", "Pokemon", "Fatal Frame", "games_hobbies", "video games", "This is a fun fact.");
        data2.add(dq12);

        Question dq13 = new Question("DummyQuestion13", "What Pokemon games came out in November 2019?","Sword and Shield","Black and White","Diamond and Pearl","Sun and Moon","games_hobbies","video games","This is a fun fact.");
        data2.add(dq13);

        return data2;
    }
}
