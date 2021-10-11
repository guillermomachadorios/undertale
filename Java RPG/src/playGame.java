import java.util.Scanner;

public class playGame
	{
		static Monster dummy;
		static Monster toriel;
		static Monster froggit;
		static Monster froggit2;
		static Monster whimsum;
		static Monster prunsel;
		static Monster vegetoid;
		static Scanner userStringInput = new Scanner(System.in);
		static Scanner userIntInput = new Scanner(System.in);
		static String pause;
		static Player p;
		static int overworldChoice;
		static boolean overworldLoop = true;
		static boolean battle = true;
		static int playerHP;
		static int playerLV;
		static int enemyHP;
		static int playerMove;
		static int playerAttack;
		static int playerAct;
		static int playerSpare;
		static int spareThreshold;
		static int enemyAttack;
		static int counter;
		
		public static void main(String[] args)
			{
				p = new Player (" ", 20, 0, 1, 0, 20, 1);
				//IntroCutscene();
				//nameGetter();
				//gameIntro();
				ruins();
			}
		public static void IntroCutscene() {
		System.out.println("Long ago, two races ruled over Earth: HUMANS and MONSTERS.");
		System.out.println("(Press the enter key to continue)");
		pause = userStringInput.nextLine();
		System.out.println("One day, war broke out between the two races.");
		pause = userStringInput.nextLine();
		System.out.println("After a long battle, the humans were victorious.");
		pause = userStringInput.nextLine();
		System.out.println("They sealed the monsters underground with a magic spell.");
		pause = userStringInput.nextLine();
		System.out.println("Many years later...");
		pause = userStringInput.nextLine();
		System.out.println("MT. EBBOT");
		System.out.println("201X");
		pause = userStringInput.nextLine();
		System.out.println("Legends say that those who climb the mountain never return.");
		pause = userStringInput.nextLine();
		System.out.println("A rambunctious child is seen running to the open top of the mountain.");
		pause = userStringInput.nextLine();
		System.out.println("They trip on a tree root and fall into the mountain.");
		}
		public static void nameGetter() {
			System.out.println("Name the fallen human.");
			int characterlockin;
			String charName = userStringInput.nextLine();
				System.out.println("Is " + charName + " the name you want? 1 = Yes, 2 = No.");
				characterlockin = userIntInput.nextInt();
				if (characterlockin==1) {
					System.out.println("You have chosen the name " + charName + ".");
					p.setName(charName);
				} else if (characterlockin==2) {
					nameGetter();
				} else {
					System.out.println("It was a really simple yes or no?");
					nameGetter();
				}
		}
		public static void gameIntro(){
		System.out.println("* You wake up face down in a bed of sunflowers.");
		pause = userStringInput.nextLine();
		System.out.println("* You look up at the hole you fell through, this possibly the last time you'll see sunlight.");
		pause = userStringInput.nextLine();
		System.out.println("* You spot a path in front of you.");	
		pause = userStringInput.nextLine();
			while(overworldLoop) {
				System.out.println("* Continue forth? 1 = Yes, 2 = No.");	
				overworldChoice = userIntInput.nextInt();
				if(overworldChoice==1) {
					overworldLoop = false;
					System.out.println("* You walk toward a large door in the distance.");
					pause = userStringInput.nextLine();
					System.out.println("* Through the door, you enter a large room, pitch black.");
					pause = userStringInput.nextLine();
					System.out.println("* You see a small, yellow flower in the distance.");
					pause = userStringInput.nextLine();
					System.out.println("* Against your own will, he starts talking to you.");
					pause = userStringInput.nextLine();
					System.out.println("???:* Howdy! I'm Flowey! Flowey the flower!");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Hmmm...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* You're new to the underground, aren'tcha?");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Golly, you must be so confused...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Someone aughta teach you how things work around here.");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* I guess little old me will have to do...");
					pause = userStringInput.nextLine();
					System.out.println("Flowey:* Ready? Here we Go!");
					pause = userStringInput.nextLine();
					System.out.println("* Seemingly like second nature, you are flung into a battle.");
					pause = userStringInput.nextLine();
					floweyTutorialBattle();
					System.out.println("???:* You are safe now, my child.");
					pause = userStringInput.nextLine();
					System.out.println("* You spot a shadowy figure walking toward you.");
					pause = userStringInput.nextLine();
					System.out.println("* As they come closer they become more clear to you.");
					pause = userStringInput.nextLine();
					System.out.println("* They seem to be some sort of... goat person?");
					pause = userStringInput.nextLine(); 
					System.out.println("???:* Do not worry, my child. My name is Toriel, and I'm here to help you.");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel grasps your hand.");
					pause = userStringInput.nextLine(); 
					System.out.println("Toriel:* Come with me, my child. We need to get you somewhere less dangerous.");
					pause = userStringInput.nextLine(); 
					System.out.println("* You and Toriel start walking toward a doorway, with dim light eminating from it.");
					pause = userStringInput.nextLine();
					System.out.println("* All of a sudden, you seem to be in a very brightly lit and lively place.");
					pause = userStringInput.nextLine(); 
					
				} else if (overworldChoice==2) {
					System.out.println("* You bask in the sunlight for a little bit longer.");
				} else {
					System.out.println("* That's not an option.");
				}
			}
		}
		public static void ruins(){
			System.out.println("* You see yourself in a place covered with purple bricks on the walls, roots, and moss.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* This, my child, are the RUINS. This will be your new home from now on.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Allow me to educate you on how these RUINS function.");
			pause = userStringInput.nextLine(); 
			System.out.println("* Next to Toriel, you spot 6 buttons and a switch on the wall.");
			pause = userStringInput.nextLine(); 
			System.out.println("* Toriel swiftly presses 2 of the buttons down, and then presses the switch.");
			pause = userStringInput.nextLine(); 
			System.out.println("Toriel:* The RUINS are full of puzzles.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Ancient fusions between diversions and doorkeys.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* You must be able to solve them from room to room.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Please get accustomed to them.");
			pause = userStringInput.nextLine();
			System.out.println("* You move on to the next room with Toriel, where you spot several swithces on the wall.");
			pause = userStringInput.nextLine(); 
			System.out.println("Toriel:* I have made a puzzle in this room to acustom you.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* You must press the correct switch to move on.");
			pause = userStringInput.nextLine();
			System.out.println("Toriel:* Do not worry, I have labeled them for you.");
			pause = userStringInput.nextLine();
			System.out.println("* You see one normal switch on the wall, and one that has several paragraphs, notes, amd arrows pointing to it");
			pause = userStringInput.nextLine();
			System.out.println("* Which one should you press? 1 = Normal Switch, 2 = Labeled Switch");
			overworldChoice = userIntInput.nextInt();
				if (overworldChoice==1) {
					System.out.println("* You press the unlabeled switch.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel goes over and presses the labeled switch herself.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Great job, my child. Let us continue forth.");
					pause = userStringInput.nextLine();
					System.out.println("* You feel a strange sense of shame");
					pause = userStringInput.nextLine();
				} else if (overworldChoice==2) {
					System.out.println("* You press the labeled switch.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Great job, my child. Let us continue forth.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* I'm sure my subtle hint helped you.");
					pause = userStringInput.nextLine();
					System.out.println("* You're not sure you agree with 'subtle' but agree anyways to not be rude");
					pause = userStringInput.nextLine();
				} else {
					System.out.println("* You stand completely still.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . . ?");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel goes over and presses the labeled switch herself.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* ...are you okay? Maybe that was too hard... let's just go forth, okay?");
					pause = userStringInput.nextLine();
					System.out.println("* You feel... something? You're not sure what your emotion is after that.");
					pause = userStringInput.nextLine();
				}
				boolean dummyFight;
				dummy = new Monster ("Dummy", 20, 1, 1, 2, 0, 0, true);
				System.out.println("* You walk into a room with a dummy in it.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* Ah yes, this is the tutorial dummy.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* That introduction fight earlier wasn't exactly... ideal. So if you want, you may fight this dummy.");
				pause = userStringInput.nextLine();
				System.out.println("* Fight the dummy? 1 = Yes, 2 = No");
				overworldChoice = userIntInput.nextInt();
					if (overworldChoice==1) {
						dummyFight=true;
						dummyTutorialBattle();
							if (dummy.isAlive()==true){
								System.out.println("Toriel:* Great job, my child! You used the power of you actions to spare that foe.");
								pause = userStringInput.nextLine();
							} else if (dummy.isAlive()==false) {
								System.out.println("Toriel:* A-ah... try... try to use mercy next time, okay?");
								pause = userStringInput.nextLine();
							}
					} else {
						dummyFight=false;
						System.out.println("Toriel:* I see. Well, lets just continue past this.");
					}
				System.out.println("* The next room is simply a tight hallway leading to an exit.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* This area is dangerous, my child. Please grab my hand.");
				pause = userStringInput.nextLine();
				System.out.println("* Toriel grips your hand.");
				pause = userStringInput.nextLine();
				System.out.println("* You're making it thorugh the hallway fine, when suddenly you lose your balance.");
				pause = userStringInput.nextLine();
				System.out.println("* You let go of Toriel's hand, and...");
				pause = userStringInput.nextLine();
				froggitBattle();
					if(froggit.isAlive()==true&&dummy.isAlive()==true) {
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* My child, are you okay?!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Oh great job my child! You used mercy to quell that Froggit!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I suppose that dummy really was helpful...");
						pause = userStringInput.nextLine();
					} else if (froggit.isAlive()==false&&dummy.isAlive()==false) {
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* My child, are you okay?!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Did you... kill that Froggit...?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* P-please stop doing that, my child...");
						pause = userStringInput.nextLine();
					} else if (froggit.isAlive()==false&&dummy.isAlive()==true||froggit.isAlive()==false&&dummyFight==false) {
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* My child, are you okay?!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Did you... kill that Froggit...?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I guess that dummy wasn't helpful after all...");
						pause = userStringInput.nextLine();
					} else if (froggit.isAlive()==true&&dummyFight==false||froggit.isAlive()==true&&dummy.isAlive()==false) {
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* My child, are you okay?!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Oh great job my child! You used mercy to quell that Froggit!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I guess that dummy wasn't helpful after all...");
						pause = userStringInput.nextLine();
					}
				System.out.println("* The next room is a simple long room with a door on the other side.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* I'm sorry my child.. but I must test you one last time.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* I need you to reach the end of the room by yourself.");
				pause = userStringInput.nextLine();
				System.out.println("Toriel:* Please... please forgive me for this.");
				pause = userStringInput.nextLine();
				System.out.println("* Toriel does a light jog across the room.");
				pause = userStringInput.nextLine();
				System.out.println("* What will you do? 1 = Run, 2 = Walk, 3 = Cry");
				overworldChoice = userIntInput.nextInt();
					if (overworldChoice==1||overworldChoice==2) {
						System.out.println("* You run to the other side of the room.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Great job my child! But... I'm afraid this is where my guidance ends.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I must run some errands, but don't believe you are alone.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel hands you a cell phone.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I'll call you whenever needed, okay?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Please stay safe, my child.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel walks away.");
						pause = userStringInput.nextLine();
					} else if (overworldChoice==3) {
						System.out.println("* You start bawling your eyes out.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* ?!?!?");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel runs back over.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* It's okay my child, please do not cry.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel hugs you.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* But... I'm afraid this is where my guidance ends.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I must run some errands, but don't believe you are alone.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel hands you a cell phone.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I'll call you whenever needed, okay?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Please stay safe, my child.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel walks away.");
						pause = userStringInput.nextLine();
					} else {
						System.out.println("* You stand completely still.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* ...?");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel runs back over.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* My child? Are you... are you feeling well?");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel puts her hand on your forehead.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Either way... I'm afraid this is where my guidance ends.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I must run some errands, but don't believe you are alone.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel hands you a cell phone.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* I'll call you whenever needed, okay?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel:* Please stay safe, my child.");
						pause = userStringInput.nextLine();
						System.out.println("* Toriel walks away.");
						pause = userStringInput.nextLine();
					}
					System.out.println("* You decide to keep moving foward through the ruins.");
					pause = userStringInput.nextLine();
					System.out.println("* The next room is--");
					pause = userStringInput.nextLine();
					System.out.println("* RING... RING...");
					pause = userStringInput.nextLine();
					System.out.println("* Your phone is ringing? Already?");
					pause = userStringInput.nextLine();
					System.out.println("* You pick up the phone.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel: Ah, my child, you actually picked up!");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* I was making pie at home and was wondering...");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Do you prefer Butterscotch or Pumpkin?");
					System.out.println("1 = Butterscotch, 2 = Pumpkin");
					overworldChoice = userIntInput.nextInt();
						if(overworldChoice==1) {
							System.out.println("Toriel:* Ah, perfect! I believe I still have some laying around at home...");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* Great! I hope to see you soon.");
							pause = userStringInput.nextLine();
						} else if (overworldChoice==2) {
							System.out.println("Toriel:* Ah, I don't believe I have any left...");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* Well, while I'm running errands, I'll pick up some for you.");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* Great! I hope to see you soon.");
							pause = userStringInput.nextLine();
						} else {
							System.out.println("* You don't say a word.");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* Uhmmm... Hello? Can you hear me?");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* I'll just make butterscotch pie.. I hope that's okay with you.");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* I hope to see you soon.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* The distant promise of homade pies lights a fire in your soul.");
					pause = userStringInput.nextLine();
					System.out.println("* You are filled with DETERMINATION.");
					pause = userStringInput.nextLine();
					System.out.println("* The next room seems to be a sliding block puzzle.");
					pause = userStringInput.nextLine();
					System.out.println("* The blocks are already pushed...?");
					pause = userStringInput.nextLine();
					System.out.println("* You spot a note on the ground.");
					pause = userStringInput.nextLine();
					System.out.println("* It reads: 'THE BLOCKS IN THIS PUZZLE WERE MAYBE TOO HEAVY FOR YOU, SO I DID THEM FOR YOU. LOVE, TORIEL'");
					pause = userStringInput.nextLine();
					System.out.println("* Well, who's to complain about a free puzzle?");
					pause = userStringInput.nextLine();
					System.out.println("* You get up from getting the note when suddenly...");
					pause = userStringInput.nextLine();
					froggitBattle2();
						if (p.getLevelOfViolence()>=3&&froggit2.isAlive()==false) {
							System.out.println("4 LEFT.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* You proceed to the next puzzle.");
					pause = userStringInput.nextLine();
					System.out.println("* At this rate, you're not even sure if there'll be any puzzles left to do.");
					pause = userStringInput.nextLine();
					System.out.println("* You walk into a room with a single piece of cheese.");
					pause = userStringInput.nextLine();
					System.out.println("* Touch it? 1 = Yes, 2 = No");
					overworldChoice = userIntInput.nextInt();
					if(overworldChoice==1) {
						System.out.println("* You touch the cheese.");
						pause = userStringInput.nextLine();
						System.out.println("* You think nothing of it.");
						pause = userStringInput.nextLine();
					} else if (overworldChoice==2) {
						System.out.println("* You decide not to touch the cheese.");
						pause = userStringInput.nextLine();
						System.out.println("* The dairy fan inside you dies a little...");
						pause = userStringInput.nextLine();
					} else {
						System.out.println("* You just look at the cheese intently.");
						pause = userStringInput.nextLine();
						System.out.println("* The cheese looks back.");
						pause = userStringInput.nextLine();
						System.out.println("* . . .");
						pause = userStringInput.nextLine();
						System.out.println("* The cheese blinks! It lost the staring contest.");
						pause = userStringInput.nextLine();
					}
					System.out.println("* From behind you you hear a strange voice.");
					pause = userStringInput.nextLine();
					System.out.println("???: EAT YOUR DAIRY PRODUCT! IT'S GOOD FOR YOUR HEALTH!");
					pause = userStringInput.nextLine();
					vegetoidFight();
						if (p.getLevelOfViolence()>=3&&vegetoid.isAlive()==false) {
							System.out.println("3 LEFT.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* The monsters in this place are seeming to get increasingly strange.");
					pause = userStringInput.nextLine();
					System.out.println("* The next room seems to be just... a ghost laying down on a patch of leaves.");
					pause = userStringInput.nextLine();
					System.out.println("* You don't want to bother them, but they are in the way...");
					pause = userStringInput.nextLine();
					System.out.println("* You approach them.");
					pause = userStringInput.nextLine();
					System.out.println("???:* Oh... haha... I didn't know if anyone could actually see me.");
					pause = userStringInput.nextLine();
					System.out.println("???: The name's Napstablook... I just like hanging around here...");
					pause = userStringInput.nextLine();
					System.out.println("* You ask Napstablook to get out of your way.");
					pause = userStringInput.nextLine();
					System.out.println("Napstablook:* Ah... I'm sorry... I can't just do that...");
					pause = userStringInput.nextLine();
					System.out.println("Napstablook:* I don't even want to do this... but the way things work around here is battles...");
					pause = userStringInput.nextLine();
					System.out.println("Napstablook:* Are you ready...? Here I come....");
					pause = userStringInput.nextLine();
					napstablookBossFight();
					System.out.println("* You move past the place Napstablook was covering.");
					pause = userStringInput.nextLine();
					System.out.println("* The next room is entirely pitch black.");
					pause = userStringInput.nextLine();
					System.out.println("* The only thing you can make out is... an eye looking at you?!?!");
					pause = userStringInput.nextLine();
					System.out.println("* The eye approaches you?!?!");
					pause = userStringInput.nextLine();
					prunselFight();
						if (p.getLevelOfViolence()>=4&&prunsel.isAlive()==false) {
							System.out.println("2 LEFT.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* The lights suddenly turn back on.");
					pause = userStringInput.nextLine();
					System.out.println("* You smell a faint smell of homemade pie... you must be close to the end.");
					pause = userStringInput.nextLine();
					System.out.println("* The next room is a straightfoward hallway.");
					pause = userStringInput.nextLine();
					System.out.println("* There just seems to be one lone monster crying in the middle...");
					pause = userStringInput.nextLine();
					System.out.println("* Confront them? 1 = Yes, 2 = No");
					overworldChoice = userIntInput.nextInt();
					if(overworldChoice==1) {
						System.out.println("* You come closer to the monster.");
						pause = userStringInput.nextLine();
						System.out.println("* Almost reluctantly, they jump at you...");
						pause = userStringInput.nextLine();
						whimsumFight();
					} else if (overworldChoice==2) {
						System.out.println("* You try to walk around the monster as quietly as you can.");
						pause = userStringInput.nextLine();
						System.out.println("* It spots you, and tries attacking...");
						pause = userStringInput.nextLine();
						whimsumFight();
					} else {
						System.out.println("* You just look at the monster.");
						pause = userStringInput.nextLine();
						System.out.println("* They look back.");
						pause = userStringInput.nextLine();
						System.out.println("* Almost reluctantly, they start making their way over to you.");
						pause = userStringInput.nextLine();
						whimsumFight();
					}
						if (p.getLevelOfViolence()>=4&&whimsum.isAlive()==false) {
							System.out.println("1 LEFT.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* The smell of pie grows ever so closer, you must be near Toriel.");
					pause = userStringInput.nextLine();
					System.out.println("* You go to the next room, and it's the front of a house.");
					pause = userStringInput.nextLine();
					System.out.println("* Walking up to the sign, it reads: 'TORIEL DREEMUR'");
					pause = userStringInput.nextLine();
					System.out.println("* You walk inside.");
					pause = userStringInput.nextLine();
					System.out.println("* The warm atmosphere fills you with a sense of nostalgia.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* !!!");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* You actually made it here! With the amount of time it was taking, I was woried you would never make it.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Nevertheless, make yourself at home.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Would you like to have some pie?");
					pause = userStringInput.nextLine();
					System.out.println("* Without waiting for your response, Toriel drags you to the dining room, where she set up a dinner for two.");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel sits you down and gives you a slice of butterscotch pie.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Well, my child, dig in!");
					pause = userStringInput.nextLine();
					System.out.println("* The pie is great. It almost reminds you of the pie your mom used to make in the surface...");
					pause = userStringInput.nextLine();
					System.out.println("* Which reminds you...");
					pause = userStringInput.nextLine();
					System.out.println("* You ask Toriel how to leave the underground.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Isn't this pie great?");
					pause = userStringInput.nextLine();
					System.out.println("* You ask Toriel if there is a way to go back home.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* This is your home now.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* It's... It's dangerous out there. You'll get killed without proper guidance.");
					pause = userStringInput.nextLine();
					System.out.println("* You ask Toriel if there's any way you can leave.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* (sigh)");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Follow me.");
					pause = userStringInput.nextLine();
					System.out.println("* Toriel takes you to the basement of the house.");
					pause = userStringInput.nextLine();
					System.out.println("* What you see is a long corridor leading to a large door at the end.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* So... you wish to leave the underground do you not?");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Ahead of us lies the end of the RUINS.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* A one-way exit to the rest of the underground.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* I am going to destroy it.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* No one will be able to leave again.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Every human that falls down here meets the same fate.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* They come.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* They leave.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* They die.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* You naive child... if you leave the RUINS...");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* They... ASGORE... will kill you.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* I am only protecting you, understend? Go back upstairs.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* . . .");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Do not try to stop me.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* This is your final warning.");
					pause = userStringInput.nextLine();
					System.out.println("* You continue walking foward towards the door, where Toriel stands in front of you.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* You want to leave so badly?");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Hmph.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* You are just like the others");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* There is only one solution to this.");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Prove yourself...");
					pause = userStringInput.nextLine();
					System.out.println("Toriel:* Prove to me you are stong enough to survive.");
					pause = userStringInput.nextLine();
					torielBattle();
						if(toriel.isAlive()==false&&p.getLevelOfViolence()==5) {
							System.out.println("* O LEFT. MISSION COMPLETE.");
							pause = userStringInput.nextLine();
						} else if (toriel.isAlive()==true) {
							System.out.println("Toriel:* If you truly wish to leave the RUINS...");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* I will not stop you.");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* However, when you do...");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* I hope you understand.");
							pause = userStringInput.nextLine();
							System.out.println("* Toriel gives you a hug.");
							pause = userStringInput.nextLine();
							System.out.println("Toriel:* Goodbye, my child.");
							pause = userStringInput.nextLine();
							System.out.println("* Toriel walks away.");
							pause = userStringInput.nextLine();
							System.out.println("* ...she looks at you for a moment.");
							pause = userStringInput.nextLine();
							System.out.println("* You see Toriel go around a corner and out of your vision.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* You walk through the RUINS door.");
					pause = userStringInput.nextLine();
					System.out.println("* You walk a long corridor that keeps getting brighter.");
					pause = userStringInput.nextLine();
					System.out.println("* At the end there's a room with a large door.");
					pause = userStringInput.nextLine();
					System.out.println("* Before you can go through, a familiar face blocks your path.");
					pause = userStringInput.nextLine();
						if(p.getExecutionPoints()==0) {
							System.out.println("Flowey:* Clever. Verrrryyy clever.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You think you're really smart, don't you?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* In this world, it's kill or be killed.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* So you were able to play by your own rules.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You spared the life of a single person.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Hee hee hee...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* I bet you feel really great.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You didn't kill anybody this time.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* But what will you do if you meet a relentless killer?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You'll die and you'll die and you'll die.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Until you tire of trying.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* What will you do then?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Will you kill out of frustration?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Or will you give up entirely on this world...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* ...and let ME inherit the power to control it?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* I am the prince of this world's future.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Don't worry, my little monarch, my plan isn't regicide.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* This is SO much more interesting.");
							pause = userStringInput.nextLine();
							System.out.println("* Flowey goes back into the ground.");
							pause = userStringInput.nextLine();
						} else if (p.getLevelOfViolence()==5) {
							System.out.println("Flowey:* Hahaha...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You're not really human, are you?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* No. You're empty inside. Just like me. In fact...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You're " + p.getName() + ", right?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* We're still inseperable, after all these years...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Listen. I have a plan to become all powerful.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Even more powerful than you and your stolen soul.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Let's destroy everything in this wretched world.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Everyone, everything in these worthless memories...");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Let's turn 'em all to dust.");
							pause = userStringInput.nextLine();
							System.out.println("* Flowey goes back into the ground.");
							pause = userStringInput.nextLine();
						} else if (p.getExecutionPoints()>=1) {
							System.out.println("Flowey:* Clever. Verrrryyy clever.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You think you're really smart, don't you?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* In this world, it's kill or be killed.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* So you were able to play by your own rules.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* You spared the life of a single person.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Froggit, Whimsum. Vegetoid, Prunsel.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Think about those names.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Do you think any of those monsters have families?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Do you think any of them have friends?");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Each one could have been someone else's Toriel.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Selfish brat.");
							pause = userStringInput.nextLine();
							System.out.println("Flowey:* Somebody is dead because of you.");
							pause = userStringInput.nextLine();
							System.out.println("* Flowey goes back into the ground.");
							pause = userStringInput.nextLine();
						}
					System.out.println("* You continue past the door.");
					pause = userStringInput.nextLine();
					System.out.println("UNDERTALE (DEMO)");
		}
		public static void froggitBattle() {
			froggit = new Monster ("Froggit", 30, 1, 2, 5, 5, 1, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = froggit.getHitPoints();
			spareThreshold = froggit.getSparePoints();
			System.out.println(froggit.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Froggit doesn't seem to want to fight anymore.");
				} else if (spareThreshold>0) {
					System.out.println("* Froggit isn't sure what's going on, but is fighting you anyways.");
				} else if (enemyHP<=10) {
					System.out.println("* Froggit is trying to run away.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - froggit.getDefence();
					System.out.println("* You hit " + froggit.getName() + " for " + playerAttack + " damage.");
					enemyHP = froggit.getHitPoints() - playerAttack;
					froggit.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Flirt, 3 = Threaten, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(froggit.getName() + ": ATK - " + froggit.getAttack() + ", DEF - " + froggit.getDefence() + ". Life is difficult for this enemy.");
					} else if (playerAct==2) {
						System.out.println("* You compliment Froggit on their... amphibian features.");
						System.out.println("Froggit:* (blushes deeply) Ribbit...");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You tell Froggit you're going to beat them up behind the school gym.");
						System.out.println("Froggit:* (shaking) R-Ribbit...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + froggit.getName() + ".");
							System.out.println("* " + froggit.getName() + " was spared. You get 0 exp and " + froggit.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+froggit.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + froggit.getName() + ".");
							System.out.println("* But " + froggit.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
						p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + froggit.getName() + " was defeated. You get " + froggit.getExecutionPoints() + " exp and " + froggit.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+froggit.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+froggit.getExecutionPoints());	
					if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
						p.setLevelOfViolence(p.getLevelOfViolence()+1);
						System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
					}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					froggit.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*froggit.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + froggit.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + froggit.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
						}
				}
				
			}	
		}
		public static void froggitBattle2() {
			froggit2 = new Monster ("Froggit", 30, 1, 1, 5, 5, 1, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = froggit2.getHitPoints();
			spareThreshold = froggit2.getSparePoints();
			System.out.println(froggit2.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Froggit doesn't seem to want to fight anymore.");
				} else if (spareThreshold>0) {
					System.out.println("* Froggit isn't sure what's going on, but is fighting you anyways.");
				} else if (enemyHP<=10) {
					System.out.println("* Froggit is trying to run away.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - froggit2.getDefence();
					System.out.println("* You hit " + froggit2.getName() + " for " + playerAttack + " damage.");
					enemyHP = froggit2.getHitPoints() - playerAttack;
					froggit2.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Flirt, 3 = Threaten, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(froggit2.getName() + ": ATK - " + froggit2.getAttack() + ", DEF - " + froggit2.getDefence() + ". Just a little frog.");
					} else if (playerAct==2) {
						System.out.println("* You compliment Froggit on their... amphibian features.");
						System.out.println("Froggit:* (blushes deeply) Ribbit...");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You tell Froggit you're going to beat them up behind the school gym.");
						System.out.println("Froggit:* (shaking) R-Ribbit...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + froggit2.getName() + ".");
							System.out.println("* " + froggit2.getName() + " was spared. You get 0 exp and " + froggit2.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+froggit2.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + froggit2.getName() + ".");
							System.out.println("* But " + froggit2.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
						p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + froggit2.getName() + " was defeated. You get " + froggit2.getExecutionPoints() + " exp and " + froggit2.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+froggit2.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+froggit2.getExecutionPoints());
						if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
							p.setLevelOfViolence(p.getLevelOfViolence()+1);
							System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
						}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
					froggit2.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*froggit2.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + froggit2.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + froggit2.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
						}
				}
				
			}	
		}
		public static void whimsumFight() {
			whimsum = new Monster ("Whimsum", 20, 1, 1, 5, 5, 1, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = whimsum.getHitPoints();
			spareThreshold = whimsum.getSparePoints();
			System.out.println(whimsum.getName() + " waddles over!");
			System.out.println("");
			while (battle) {
				if (spareThreshold<=0) {
					System.out.println("* Whimsum doesn't seem want to fight.");
				} else if (enemyHP<=10) {
					System.out.println("* Whimsum is crying so hard no noise is coming out.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - whimsum.getDefence();
					System.out.println("* You hit " + whimsum.getName() + " for " + playerAttack + " damage.");
					enemyHP = whimsum.getHitPoints() - playerAttack;
					whimsum.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Console, 3 = Agitate, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(whimsum.getName() + ": ATK - " + whimsum.getAttack() + ", DEF - " + whimsum.getDefence() + ". Moth-like creature with premanent tears in its eyes.");
					} else if (playerAct==2) {
						System.out.println("* You try to tell Whimsum everything is going to be alright.");
						System.out.println("* Before you even begin, Whimsum's eyes start flowing with tears.");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You tell Whimsum that they're trapped inside a video game.");
						System.out.println("* Whimsum has never cried harder in their life.");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + whimsum.getName() + ".");
							System.out.println("* " + whimsum.getName() + " was spared. You get 0 exp and " + whimsum.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+whimsum.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + whimsum.getName() + ".");
							System.out.println("* But " + whimsum.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
						p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + whimsum.getName() + " was defeated. You get " + whimsum.getExecutionPoints() + " exp and " + whimsum.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+whimsum.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+whimsum.getExecutionPoints());
						if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
							p.setLevelOfViolence(p.getLevelOfViolence()+1);
							System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
						}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
					whimsum.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*whimsum.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + whimsum.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + whimsum.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
						}
				}
				
			}	
		}
		public static void prunselFight() {
			prunsel = new Monster ("Prunsel", 30, 1, 1, 5, 5, 1, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = prunsel.getHitPoints();
			spareThreshold = prunsel.getSparePoints();
			System.out.println(prunsel.getName() + " looks around!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Prunsel seems to be looking elsewhere to go.");
				} else if (spareThreshold>0) {
					System.out.println("* Prunsel's stare is hurting your head.");
				} else if (enemyHP<=10) {
					System.out.println("* Prunsel starts rolling off.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - prunsel.getDefence();
					System.out.println("* You hit " + prunsel.getName() + " for " + playerAttack + " damage.");
					enemyHP = prunsel.getHitPoints() - playerAttack;
					prunsel.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Stare, 3 = Poke, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(prunsel.getName() + ": ATK - " + prunsel.getAttack() + ", DEF - " + prunsel.getDefence() + ". Floating eye ball? Looking at it kind of freaks you out...");
					} else if (playerAct==2) {
						System.out.println("* You stare at Prunsel.");
						System.out.println("* They stare right back.");
						System.out.println("* Beautiful demonstration of inter-species conversation.");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You poke Prunsel with a stick.");
						System.out.println("* Prunsel forms skin around itself and blinks.");
						System.out.println("* You were not prepared for these eldritch horrors..");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + prunsel.getName() + ".");
							System.out.println("* " + prunsel.getName() + " was spared. You get 0 exp and " + prunsel.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+prunsel.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + prunsel.getName() + ".");
							System.out.println("* But " + prunsel.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
						p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + prunsel.getName() + " was defeated. You get " + prunsel.getExecutionPoints() + " exp and " + prunsel.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+prunsel.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+prunsel.getExecutionPoints());
						if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
							p.setLevelOfViolence(p.getLevelOfViolence()+1);
							System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
						}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
					prunsel.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*prunsel.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + prunsel.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + prunsel.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
						}
				}
				
			}	
		}
		public static void vegetoidFight() {
			vegetoid = new Monster ("Vegetoid", 30, 1, 1, 5, 5, 1, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = vegetoid.getHitPoints();
			spareThreshold = vegetoid.getSparePoints();
			System.out.println(vegetoid.getName() + " plucks itself out of the ground!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* Vegetoid seems to be fulfilled.");
				} else if (spareThreshold>0) {
					System.out.println("* Vegetoid tells you that nutrition is vital to a healthy lifestyle.");
				} else if (enemyHP<=10) {
					System.out.println("* Vegetoid wants to go back into the ground.");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - vegetoid.getDefence();
					System.out.println("* You hit " + vegetoid.getName() + " for " + playerAttack + " damage.");
					enemyHP = vegetoid.getHitPoints() - playerAttack;
					vegetoid.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Dinner, 3 = Devour, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(vegetoid.getName() + ": ATK - " + vegetoid.getAttack() + ", DEF - " + vegetoid.getDefence() + ". Just a turnip. It's eyes and mouth are kind of uncanny, though...");
					} else if (playerAct==2) {
						System.out.println("* You set up a lovely dinner with Vegetoid.");
						System.out.println("* It's a great time. You learn a lot about each other.");
						System.out.println("* The food was just dirt, but who's to judge?");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==3) {
						System.out.println("* You take a bite out of Vegetoid.");
						System.out.println("Vegetoid:* YES! GREENS ARE GOOD FOR YOU!");
						System.out.println("* They... liked that...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + vegetoid.getName() + ".");
							System.out.println("* " + vegetoid.getName() + " was spared. You get 0 exp and " + vegetoid.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+vegetoid.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + vegetoid.getName() + ".");
							System.out.println("* But " + vegetoid.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* I'm outta here...");
						battle=false;
						p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + vegetoid.getName() + " was defeated. You get " + vegetoid.getExecutionPoints() + " exp and " + vegetoid.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+vegetoid.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+vegetoid.getExecutionPoints());
						if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
							p.setLevelOfViolence(p.getLevelOfViolence()+1);
							System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
						}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
					vegetoid.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					enemyAttack = (int) ((Math.random()*vegetoid.getAttack()) + 1) - p.getArmor();
					playerHP = playerHP - enemyAttack;
					p.setHitPoints(playerHP);
					System.out.println("* " + vegetoid.getName() + " attacks. You take " + enemyAttack + " damage.");
						if (playerHP<=0){
							System.out.println("* " + vegetoid.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
						}
				}
				
			}	
		}
		public static void napstablookBossFight() {
			Monster napstablook = new Monster ("Napstablook", 30, 1, 1, 5, 5, 1, true);
			counter=0;
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = napstablook.getHitPoints();
			spareThreshold = napstablook.getSparePoints();
			System.out.println(napstablook.getName() + " floats by!");
			System.out.println("");
			while (battle) {
				System.out.println("* Napstablook has his headphones on. Can he hear you...?");
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					System.out.println("Napstablook:* Oh... right... haha... forogt to tell you...");
					System.out.println("Napstablook:* You can't actually damage me... you can't touch a ghost, can you...?");
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Cheer Up, 3 = Cry 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(napstablook.getName() + ": ATK - " + napstablook.getAttack() + ", DEF - " + napstablook.getDefence() + ". Funny looking ghost with headphones. Are you sure it's not just a costume...?");
					} else if (playerAct==2) {
						System.out.println("* You try to cheer up Napstablook.");
						System.out.println("* It doesn't seem like he's listening to you.");
						System.out.println("* Do ghosts even have ears..?");
					} else if (playerAct==3) {
						System.out.println("* You cry with Napstablook.");
						System.out.println("* He doesn't even flinch.");
						System.out.println("* Does... does he know you're here...?");
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + napstablook.getName() + ".");
							System.out.println("* " + napstablook.getName() + " was spared. You get 0 exp and " + napstablook.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+napstablook.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + napstablook.getName() + ".");
							System.out.println("* But " + napstablook.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("* You think about leaving... but you wouldn't want to leave Napstablook alone.");
						battle = true;
					}
				}
				if (enemyHP>0&&spareThreshold>=1){
					counter++;
					if (counter==1) {
						System.out.println("Napstablook:* Aha... I guess this isn't really a fight if neither of us are... y'know... fighting.");
						pause = userStringInput.nextLine();
						System.out.println("Napstablook:* I guess I just wanted somone to notice I was here...");
						pause = userStringInput.nextLine();
						battle = true;
					} else if (counter==2) {
						System.out.println("Napstablook:* Well.. now that we're here... let's get to know each other.");
						pause = userStringInput.nextLine();
						System.out.println("Napstablook:* What hobbies do you have...?");
						pause = userStringInput.nextLine();
						battle = true;
					} else if (counter==3) {
						System.out.println("Napstablook:* ...Not talkative, huh? Here... I'll go first.");
						pause = userStringInput.nextLine();
						System.out.println("Napstablook:* I'm big into fashion... I like making my own clothes from time to time...");
						pause = userStringInput.nextLine();
						battle = true;
					} else if (counter==4) {
						System.out.println("Napstablook:* Here... I'll show you how I do it...");
						pause = userStringInput.nextLine();
						System.out.println("* Napstablook starts crying into the ground.");
						pause = userStringInput.nextLine();
						System.out.println("* He... makes a top hat out of his tears?");
						pause = userStringInput.nextLine();
						System.out.println("* Napstablook puts it on.");
						pause = userStringInput.nextLine();
						System.out.println("Napstablook:* So... what do you think...? Do I look good...?");
						pause = userStringInput.nextLine();
						System.out.println("* What do you think? 1 = Looks Great, 2 = Looks Terrible");
						playerAct = userIntInput.nextInt();
							if(playerAct==1) {
								System.out.println("Napstablook:* Hah... finally... someone appreciates my craft...");
								pause = userStringInput.nextLine();
								System.out.println("Napstablook:* Let's hang out again sometime... I live in WATERFALL, if you ever make it there...");
								pause = userStringInput.nextLine();
								System.out.println("Napstablook:* See you again...");
								pause = userStringInput.nextLine();
								System.out.println("* Napstablook floats away.");
								pause = userStringInput.nextLine();
							} else if (playerAct==2) {
								System.out.println("Napstablook: . . . ");
								pause = userStringInput.nextLine();
								System.out.println("* Napstablook floats away.");
								pause = userStringInput.nextLine();
							} else {
								System.out.println("Napstablook:* . . . Your silence is deafening.");
								pause = userStringInput.nextLine();
								System.out.println("* Napstablook floats away.");
								pause = userStringInput.nextLine();
							}
						System.out.println("* That was... strange. Can that even count as a battle?");
						pause = userStringInput.nextLine();
						battle=false;
					}
				}
			}	
		}
		public static void floweyTutorialBattle() {
			Monster flowey = new Monster ("Flowey", 30, 1, 2, 5, 0, 0, true);
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = flowey.getHitPoints();
			spareThreshold = flowey.getSparePoints();
			System.out.println(flowey.getName() + " draws near!");
				if(spareThreshold>0) {
					System.out.println("Flowey:* Hey! See that menu down there? That's your BATTLE MENU!");
					System.out.println("Flowey:* This lets you do all sorts of things in battle.");
					System.out.println("Flowey:* Above that battle menu are your stats! LV stands for love, and you can get more by gaining exp!");
					System.out.println("Flowey:* Hit the ACT key (2 on your keyboard), I'll show you some cool stuff you can do!");
				while (battle) {
				if (spareThreshold<=0&&playerMove==2) {
					System.out.println("Flowey:* Great! Now here comes the best part.");
					System.out.println("Flowey:* In a battle, you don't have to kill!");
					System.out.println("Flowey:* Press that Mercy button, and you'll be able to spare me!");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* You got your ears open bud? I said hit the ACT key.");
					} else if (spareThreshold<=0) {
						System.out.println("Flowey:* ...You serious? This is like, the dictionary OPPOSITE of mercy. Try again.");
					}
				} else if (playerMove==2) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Great! That down there is the ACT menu. You can do all sorts of things with this!");
						System.out.println("ACT: 1 = Check, 2 = Converse, 3 = Stare");
						playerAct = userIntInput.nextInt();
							if(playerAct==1) {
							System.out.println(flowey.getName() + ": ATK - " + flowey.getAttack() + ", DEF - " + flowey.getDefence() + ". Your good pal Flowey.");
							spareThreshold = spareThreshold - 1;
						} else if (playerAct==2) {
							System.out.println("* You tried to start a conversation with flowey.");
							System.out.println("Flowey:* I appreciate the intent, but I'm kinda busy with... well, this.");
							spareThreshold = spareThreshold - 1;
						} else if (playerAct==3) {
							System.out.println("* You just kinda... stared at Flowey");
							System.out.println("Flowey:* Uhh.... I'm just going to assume this was an ACT.");
							spareThreshold = spareThreshold - 1;
						}
					} else if (spareThreshold<=0) {
						System.out.println("Flowey:* You JUST did this. what kinda memory do people from the surface have?");
					}
				} else if (playerMove==3) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Does this look like an ACT menu to you, numbskull?");
					} else if(spareThreshold<=0) {
						System.out.println("Flowey:* Does this looks like a Mercy menu to you, numbskull?");
					}
				} else if (playerMove==4) {
					if(spareThreshold>0) {
						System.out.println("Flowey:* Do what you're told and just hit the ACT key! Is everyone from the surface this idiotic...?");
					} else if (spareThreshold<=0){
						battle = false;
						System.out.println("Flowey:* Good job! Now I've been spared.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* ...");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* You IDIOT.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* DID YOU REALLY THINK THAT'S HOW THIS WORKED?");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* IN THIS WORLD...");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* IT'S KILLED OR BE KILLED!");
						pause = userStringInput.nextLine();
						System.out.println("* Flowey starts to attack you. He has you cornered.");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* HAHAHAHAHAHAHAHA--");
						pause = userStringInput.nextLine();
						System.out.println("Flowey:* AH-");
						pause = userStringInput.nextLine();
						System.out.println("* Suddenly, a fireball comes out of nowhere and knocks Flowey out of place.");
						pause = userStringInput.nextLine();
					}
				}
				}
			}	
		}
		public static void dummyTutorialBattle() {
			dummy = new Monster ("Dummy", 20, 1, 1, 2, 0, 0, true);
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = dummy.getHitPoints();
			spareThreshold = dummy.getSparePoints();
			System.out.println(dummy.getName() + " draws near!");
			System.out.println("");
			while (battle) {
				if (spareThreshold==0) {
					System.out.println("* The dummy doesn't seem to want to fight anymore.");
					System.out.println("Toriel:* Text like that tells you when an enemy can be spared. Use context clues to your advantage!");
				} else if (spareThreshold>0) {
					System.out.println("* The dummy sure is just standing there.");
				} else if (enemyHP<=20) {
					System.out.println("* You see one drop of sweat fall from the dummy's head");
				}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - dummy.getDefence();
					System.out.println("* You hit " + dummy.getName() + " for " + playerAttack + " damage.");
					enemyHP = dummy.getHitPoints() - playerAttack;
					dummy.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Hug, 3 = Talk, 4 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(dummy.getName() + ": ATK - " + dummy.getAttack() + ", DEF - " + dummy.getDefence() + ". Life is difficult for this enemy.");
					} else if (playerAct==3) {
						System.out.println("* You talk to the dummy.");
						System.out.println("Dummy:* . . . ");
						System.out.println("* They doesn't seem to be much for conversation.");
						spareThreshold = spareThreshold - 1;
					} else if (playerAct==2) {
						System.out.println("* You hug the dummy.");
						System.out.println("Dummy:* . . . :)");
						System.out.println(" They seem to have liked that...?");
						spareThreshold = spareThreshold - 1;
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare, 2 = Flee");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + dummy.getName() + ".");
							System.out.println("* " + dummy.getName() + " was spared. You get 0 exp and " + dummy.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+dummy.getGoldGiven());
							battle = false;
						} else if (playerSpare>0) {
							System.out.println("* You attempted to spare " + dummy.getName() + ".");
							System.out.println("* But " + dummy.getName() + " wouldn't listen...");
						}
					}
					if (playerSpare==2) {
						System.out.println("Toriel:* In a normal battle you can flee by doing this, but I would rather you just finish this fight, my child.");
					}
				}
				if (enemyHP<=0) {
					System.out.println("* " + dummy.getName() + " was defeated. You get " + dummy.getExecutionPoints() + " exp and " + dummy.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+dummy.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+dummy.getExecutionPoints());
					dummy.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					System.out.println("* . . .");
						if (playerHP<=0){
							System.out.println("* " + dummy.getName() + " has defeated you. Don't give up, " + p.getName() + "! Stay determined...");
							battle = false;
						}
				}
				
			}	
		}
		public static void torielBattle() {
			toriel = new Monster ("Toriel", 1, 1, 2, 5, 5, 1, true);
			counter=0;
			battle=true;
			playerLV = p.getLevelOfViolence();
			playerHP = p.getHitPoints();
			enemyHP = toriel.getHitPoints();
			spareThreshold = toriel.getSparePoints();
			System.out.println(toriel.getName() + " blocks the way!");
			System.out.println("");
			while (battle) {
					if (counter<=2) {
						System.out.println("* Toriel is using her magical attacks.");
					} else if (counter>2&&counter<10) {
						System.out.println("* Toriel sees through you.");
					}
				System.out.println("LV - " + playerLV + " HP - " + playerHP);
				System.out.println("1 = Attack, 2 = ACT, 3 = Item, 4 = Mercy");
				playerMove = userIntInput.nextInt();
				if (playerMove==1) {
					playerAttack = (int) ((Math.random()*p.getWeapon()) + 5) - toriel.getDefence();
					System.out.println("* You hit " + toriel.getName() + " for 23701275 damage.");
					enemyHP = toriel.getHitPoints() - playerAttack;
					toriel.setHitPoints(enemyHP);
				} else if (playerMove==2) {
					System.out.println("ACT: 1 = Check, 2 = Talk, 3 = Exit");
					playerAct = userIntInput.nextInt();
					if(playerAct==1) {
						System.out.println(toriel.getName() + ": ATK - " + toriel.getAttack() + ", DEF - " + toriel.getDefence() + ". Knows best for you.");
					} else if (playerAct==2) {
						System.out.println("* You can't think of any conversation topics.");
					} else {
						battle=true;
					}
				} else if (playerMove==3) {
					System.out.println("* You don't have any items.");
				} else if (playerMove==4) {
					System.out.println("Mercy: 1 = Spare");
					playerSpare = userIntInput.nextInt();
					if (playerSpare==1) {
						if(spareThreshold==0) {
							System.out.println("* You attempted to spare " + toriel.getName() + ".");
							System.out.println("* " + toriel.getName() + " was spared. You get 0 exp and " + toriel.getGoldGiven() + " gold.");
							p.setGold(p.getGold()+toriel.getGoldGiven());
							p.setHitPoints((9 + p.getLevelOfViolence())* 2);	
							battle = false;
						} else if (playerSpare>0) {
							counter++;
						}
					}
				}
				if (enemyHP<=0) {
					if (p.getLevelOfViolence()>=4) {
						System.out.println("Toriel: Y...you really hate me that much?");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: Now I see who I was protecting by keeping you there...");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: N-not you, but them! Ha... ha...");
						pause = userStringInput.nextLine();
					} else if (counter>10) {
						System.out.println("Toriel: You... at my most vulnerable moment...");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: To think I was worried you wouldn't fit out there... Eheheheh!!!!");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: You really are no different from them! Ha.... ha....");
						pause = userStringInput.nextLine();
					} else {
						System.out.println("Toriel: Urgh... you are stronger than I though. Listen to me, small one.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: Beyond this door... keep walking as far as you can. You'll reach an exit...");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: ...ASGORE... do not let ASGORE take your soul... his plan cannot succed...");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: Be good, won't you? My child...");
						pause = userStringInput.nextLine();
					}
					System.out.println("* " + toriel.getName() + " was defeated. You get " + toriel.getExecutionPoints() + " exp and " + toriel.getGoldGiven() + " gold.");
					p.setGold(p.getGold()+toriel.getGoldGiven());
					p.setExecutionPoints(p.getExecutionPoints()+toriel.getExecutionPoints());	
					if (p.getExecutionPoints()>=p.getLevelOfViolence()*2) {
						p.setLevelOfViolence(p.getLevelOfViolence()+1);
						System.out.println("You leveled up. Your level is now " + p.getLevelOfViolence() + ".");
					}
					p.setHitPoints((9 + p.getLevelOfViolence())* 2);
					toriel.setAlive(false);
					battle = false;
				} else if (enemyHP>0&&spareThreshold>=1){
					if (playerHP>=10) {
						enemyAttack = (int) ((Math.random()*toriel.getAttack()) + 1) - p.getArmor();
						playerHP = playerHP - enemyAttack;
						p.setHitPoints(playerHP);
						System.out.println("* " + toriel.getName() + " attacks. You take " + enemyAttack + " damage.");
					} else if (playerHP<10&&counter<10) {
						System.out.println("* Toriel's attacks are missing...?");
					}
					if (counter==1) {
						System.out.println("Toriel:* . . . ?");
						pause = userStringInput.nextLine();
					} else if (counter==3) {
						System.out.println("Toriel:* . . . . . . . . .");
						pause = userStringInput.nextLine();
					} else if (counter==5) {
						System.out.println("Toriel:* What are you doing?");
						pause = userStringInput.nextLine();
					} else if (counter==6) {
						System.out.println("Toriel: Attack or run away!");
						pause = userStringInput.nextLine();
					} else if (counter==7) {
						System.out.println("Toriel: Fight me or leave!");
						pause = userStringInput.nextLine();
					} else if (counter==8) {
						System.out.println("Toriel: Stop looking at me that way...");
						pause = userStringInput.nextLine();
					} else if (counter==8) {
						System.out.println("Toriel: Go away!");
						pause = userStringInput.nextLine();
					} else if (counter==10) {
						System.out.println("Toriel: I know what you want me to do but...");
						pause = userStringInput.nextLine();
					} else if (counter==11) {
						System.out.println("Toriel: Please... just go upsteirs...");
						pause = userStringInput.nextLine();
					} else if (counter==12) {
						System.out.println("Toriel: I promise I will take good care of you here.");
						pause = userStringInput.nextLine();
					} else if (counter==13) {
						System.out.println("Toriel: I know we do not have much, but...");
						pause = userStringInput.nextLine();
					} else if (counter==14) {
						System.out.println("Toriel: You can live a good life here.");
						pause = userStringInput.nextLine();
					} else if (counter==15) {
						System.out.println("Toriel: Why are you making this so difficult?");
						pause = userStringInput.nextLine();
					} else if (counter==16) {
						System.out.println("Toriel: Please... go upstairs.");
						pause = userStringInput.nextLine();
					} else if (counter==17) {
						System.out.println("Toriel: Ha ha...");
						pause = userStringInput.nextLine();
					} else if (counter==18) {
						System.out.println("Toriel: Pathetic, is it not? I cannot save even a single child.");
						pause = userStringInput.nextLine();
					} else if (counter==19) {
						System.out.println("Toriel: No... I understand. You would be unhappy down here.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: The RUINS are very small once you get used to them.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: It would not be right to make you grow up in a place like this.");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: My expectations... my loneliness... my fear...");
						pause = userStringInput.nextLine();
						System.out.println("Toriel: For you, my child, I will put them aside.");
						pause = userStringInput.nextLine();
						battle=false;
					}
				}
				
			}	
		}
				
	}

