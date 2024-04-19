package com.techelevator;

import java.math.BigInteger;

public class Exercises {

    /**
     * For the purposes of this exercise, the following naming rules are tested:
     *
     * Variable names:
     *  - must start with a lowercase character a-z.
     *  - underscore ('_') characters are not allowed.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to camel case them as appropriate.
     *
     * Constant names:
     *  - must start with an uppercase character A-Z.
     *  - dollar sign ('$') characters are not allowed.
     *  - must be at least two characters in length.
     *  - You are encouraged to create descriptive names and are required to upper case them as appropriate.
     *
     * Due to practical limitations, camel case and pascal case are not tested other than checking the first
     * character of the name is lower case for variables and upper case for constants. Your instructor will
     * manually review your solution checking for the correct casing.
     */

	public static void main(String[] args) {

        /* Exercise 1
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */
		// ### EXAMPLE:
		int birdsOnABranch = 4;
		int birdsThatFlyAway = 1;
		int birdsRemaining = birdsOnABranch - birdsThatFlyAway;
		System.out.println("birds left on the branch"+ birdsRemaining);


        /* Exercise 2
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */
		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;
		System.out.println("more birds are there than nest is"+numberOfExtraBirds);

        /* Exercise 3
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */

        int plyaingRaccoonsNumber = 3;
        int leftToHome = 2;
        int restOfRaccoonsNumber = plyaingRaccoonsNumber - leftToHome;
        System.out.println("left raccoons in the wood is"+ restOfRaccoonsNumber);


        /* Exercise 4
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3;
		int lessBeesNumber = numberOfFlowers - numberOfBees;
		System.out.println("Less bean than flowers is"+ lessBeesNumber);



        /* Exercise 5
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
        int eatingBreadcrumbsPigeonNumber = 1;
        int addedNumberOfPigeon = 1;
		int totalNumbersOfPigeon = eatingBreadcrumbsPigeonNumber + addedNumberOfPigeon;
		 System.out.println("Total numbers of pigeon is"+ totalNumbersOfPigeon);



        /* Exercise 6
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */
		int sittingNumbersOwlOnFence = 3;
		int joinedOwlNumbers = 2;
		int totalNumbersOfOwls = sittingNumbersOwlOnFence + joinedOwlNumbers;
		System.out.println("total numbers of owls on the fence is" + totalNumbersOfOwls);


        /* Exercise 7
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */
        int workingBeaversNumbers = 2;
        int leftToSwim = 1;
        int stillWorkingBeaversNumber = workingBeaversNumbers - leftToSwim;
        System.out.println("Still working beavers number is"+stillWorkingBeaversNumber);

        /* Exercise 8
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
        int numberOfToucansOnATree = 2;
        int joinToucanNumber =1;
		int totalToucansNumber = numberOfToucansOnATree	- joinToucanNumber;
        System.out.println(" total toucans number is"+ totalToucansNumber);

        /* Exercise 9
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
        int numberOfSquirrels = 4;
        int availableNuts = 2;
        int extraSquirrelsNumber = numberOfSquirrels - availableNuts;
        System.out.println("More number of squirrels than nuts is"+ extraSquirrelsNumber);

        /* Exercise 10
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
        int foundquarte = 25/100;
        int foundDime = 10/100;
        int foundNickles = (5*2)/100;
        int totalFoundMoney = foundquarte + foundDime + foundNickles;
        System.out.println(" Mrs. Hlit found total money is"+ totalFoundMoney);

        /* Exercise 11
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
        int MrsBrierClassBakesMuffins = 18;
        int MrsMacAdamClassBakesMuffins = 20;
        int MrsFlanneryClassBakesMuffins = 17;
        int totalFirstclassBakesMuffinsNumber = MrsBrierClassBakesMuffins + MrsMacAdamClassBakesMuffins + MrsFlanneryClassBakesMuffins;
        System.out.println("Mrs hilts favorite first class total baking muffins" + totalFirstclassBakesMuffinsNumber);
        


        /* Exercise 12
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
        int priceOfYoyoy = 24/100;
        int priceOfwhistle = 14/100;
        int totalSpendMoneyOfMrsHilt = priceOfYoyoy + priceOfwhistle;
        System.out.println(" Mrs Hault spent money on toys"+ totalSpendMoneyOfMrsHilt);



        /* Exercise 13
        13. Mrs. Hilt made 5 Rice Krispies Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
        int riceKriespiesTreatsMade = 5;
        int usedLargeMarshmallows = 8;
        int usedMiniMarshmallows = 10;
        int usedTotalMarshmallows = usedLargeMarshmallows + usedMiniMarshmallows;
        System.out.println("Mrs Hilt used total marshmallows to made 5 rice krispies treats"+ usedTotalMarshmallows);

        /* Exercise 14
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
        int MrsHiltHadSnowInches = 29;
        int brecknockElementarySchoolReceivedSnowInches = 17;
        int restOfSnowAmount = MrsHiltHadSnowInches - brecknockElementarySchoolReceivedSnowInches;
        System.out.println(" Rest amount of snow"+ restOfSnowAmount);



        /* Exercise 15
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2.50 on a pencil
        case. How much money does she have left?
        */
        int MrshiltHas = 10;
        int priceOfToyTruck = 3;
        double priceOfPencilCase = 2.50;
        double MrsHlitHasleftMoney = MrshiltHas - priceOfToyTruck- priceOfPencilCase ;
        System.out.println("Mrs Hilt has left money"+ MrsHlitHasleftMoney);


        /* Exercise 16
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
        int joshHadMarbles = 16;
        int lostMarbles = 7;
        int restOfMarblesNumber = joshHadMarbles - lostMarbles;
        System.out.println(" now Josh have marbles number"+ restOfMarblesNumber);

        /* Exercise 17
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
        int meganHadSeashellsNumber = 19;
        int meganCollectionNumber =25;
        int meganNeededNumberOfSeashells = meganCollectionNumber - meganHadSeashellsNumber;
        System.out.println(" Megan need to make 25 seashells"+ meganNeededNumberOfSeashells);


        /* Exercise 18
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
        int totalBalloonsNumber = 17;
        int redBalloonsNumbers = 8;
        int greenBalloonsNumbers = totalBalloonsNumber - redBalloonsNumbers;
        System.out.println("Brad have number of green balloons"+ greenBalloonsNumbers);

        /* Exercise 19
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
        int booksOnTheShelf = 38;
        int martaAddedBooks = 10;
        int totalBooksNumberOnShelf = booksOnTheShelf + martaAddedBooks;
        System.out.println("Total books number on shelf"+ totalBooksNumberOnShelf);

        /* Exercise 20
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
        int beeLegsNumber = 6;
        int nuberOfBees = 8;
        int totalNumbersOfBeesLegs = beeLegsNumber * nuberOfBees;
        System.out.println("total bees legs numbrer"+ totalNumbersOfBeesLegs);

        /* Exercise 21
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
        double perIceCreamPrice = 0.99;
        double numberOfIceCream = 2;
        double priceOf2IceCrean = perIceCreamPrice * numberOfIceCream ;
        System.out.println("Mrs Hilt bought IceCreams price is"+ priceOf2IceCrean);


        /* Exercise 22
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
        int totalNeedRocksNumber = 125;
        int mrsHiltHaveRocks = 64;
        int extraNeedRocks = totalNeedRocksNumber - mrsHiltHaveRocks;
        System.out.println("Mrs Hilt needed rock to complete border around her garden is"+ extraNeedRocks);

        /* Exercise 23
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
        int mrsHiltHadMarblesNumber = 38;
        int lostNumberOfMarbles = 15;
        int leftMarblesNumber = mrsHiltHadMarblesNumber - lostNumberOfMarbles;
        System.out.println("Mrs Hilt have left marbles number is"+ leftMarblesNumber);


        /* Exercise 24
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */
        int distanceToConcertInMiles = 78;
        int droveDistanceInMiles = 32;
        int leftToDriveDistance = distanceToConcertInMiles - droveDistanceInMiles;
        System.out.println("Rest of miles to reach  to a concert is "+ leftToDriveDistance);


        /* Exercise 25
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time (in minutes) did she spend shoveling snow?
        */
        int spendingTimeInTheMorningInMinutes = (1*60+30);
        int spendingTimeInEveningInMinutes = 45;
        int totalSpendingTime = spendingTimeInTheMorningInMinutes + spendingTimeInEveningInMinutes;
        System.out.println("Mrs Hilt spent total time to shoveling snow in minutes"+totalSpendingTime);


        /* Exercise 26
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
        double perHotDogPrice =0.50;
        double numberOfHotDog = 6;
        double totalPriceOfHotDogs = perHotDogPrice * numberOfHotDog;
        System.out.println("total pricr ofhot Dogs is"+ totalPriceOfHotDogs);



        /* Exercise 27
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
        double mrsHiltHasMoney = 0.50;
        double priceOfPerPencil = 0.07;
        double numberOfPencilGet = mrsHiltHasMoney / priceOfPerPencil;
        System.out.println("Mrs hilt get number of pencil by her money is"+ numberOfPencilGet);


        /* Exercise 28
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
        int totalNumbersOfButterflies = 33;
        int numbersOfOrangeButterflies = 20;
        int  numberOfRedButterflies = totalNumbersOfButterflies-numbersOfOrangeButterflies;
        System.out.println("Mrs. Hilt seen Red Butterflies numbers is"+ numberOfRedButterflies);



        /* Exercise 29
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
        double clerkGotMoney = 1;
        double candyPrice = 0.54;
        double returnMoney = clerkGotMoney-candyPrice;
        System.out.println("Kate got retun money is"+ returnMoney);

        /* Exercise 30
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
        int markBackyardTreesNumber = 13;
        int addedNewPlant = 12;
        int  totalPlants = markBackyardTreesNumber + addedNewPlant;
        System.out.println(" Total number of trees in mark backyard is "+ totalPlants);


        /* Exercise 31
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
        long nextToSeeGrandmaHour = 2*24;
        System.out.println("Joy will see to grandma is"+nextToSeeGrandmaHour);


        /* Exercise 32
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
        int cousinsNumber =4;
        int eachCousinsGetGum = 5;
        int totalGumNeed = cousinsNumber * eachCousinsGetGum;
        System.out.println("Kim need numbers of Gum to give each cousins 5 is"+ totalGumNeed);



        /* Exercise 33
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
        int haveMoney = 3;
        int candybarPrice = 1;
        int leftmoney = haveMoney - candybarPrice;
        System.out.println("Dan has rest of money after after candybar"+ leftmoney);


        /* Exercise 34
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
        int boatInLake = 5;
        int eachBoatGetPeople = 3;
        int totalPeopleOnAllBoats= boatInLake * eachBoatGetPeople;
        System.out.println(" Total people are on boat in the lake"+ totalPeopleOnAllBoats);


        /* Exercise 35
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
        int EllenHadLegos = 380;
        int lostLegos = 57;
        int ellenHaveNowLegos = EllenHadLegos- lostLegos;
        System.out.println("now Ellen has numbers of legos"+ ellenHaveNowLegos);


        /* Exercise 36
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
        int  arthurBakedMuffins = 35;
        int  totalHaveToBakeMuffins = 83;
        int  neededBakedMuffins = totalHaveToBakeMuffins - arthurBakedMuffins;
        System.out.println(" Arthur needed to bake to make 85 muffins is"+ neededBakedMuffins);


        /* Exercise 37
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
        int crayonsNumberOfWilly = 1400;
        int crayonsNumberOfLucy = 290;
        int numberOfCrayonsMoreThenLucy = crayonsNumberOfWilly - crayonsNumberOfLucy;
        System.out.println("Lucy needed crayons to make Willy's crayons number is"+ numberOfCrayonsMoreThenLucy);


        /* Exercise 38
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
        int stickersOnaPageNumbers = 10;
        int iHavePagesOfStickers =22;
        int totalNumbersOfStickers = stickersOnaPageNumbers * iHavePagesOfStickers;
        System.out.println("I have Total numbers of stickers is"+ totalNumbersOfStickers);

        /* Exercise 39
        39. There are 100 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
        int numbersOfCupCakes = 100;
        int numbersOfChildren = 8;
        int equallyShareOfCupCakes = numbersOfCupCakes / numbersOfChildren;
        System.out.println("They get equally cupcakes is"+ equallyShareOfCupCakes);


        /* Exercise 40
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies, how many
        cookies will not be placed in a jar?
        */
        int totalNumberOfGingerbread = 47;
        int cookiesPerJar = 6;
        int extraCookies = totalNumberOfGingerbread % cookiesPerJar;
        System.out.println("Extra gingerbread cookies number is"+ extraCookies);

        /* Exercise 41
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received an equal number of croissants,
        how many will be left with Marian?
        */
        int preparedCroissants = 59;
        int neighborsNumber = 8;
        int extraCroissants = preparedCroissants % neighborsNumber;
        System.out.println("Mariana will have extra croissants number is "+ extraCroissants);

        /* Exercise 42
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
        int totalCookiesNumber = 276;
        int eachTrayCookiesPlace =12;
        int totalTraysNumber = totalCookiesNumber / eachTrayCookiesPlace;
        System.out.println(" Total number of trays to place all cookies in a time is"+ totalTraysNumber);

        /* Exercise 43
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
        int numberOfPretzels = 480;
        int oneServingNumber = 12;
        int numberOfServingTimes = numberOfPretzels / oneServingNumber;
        System.out.println("Marian Serving of bite-sized pretzels times is"+ numberOfServingTimes);

        /* Exercise 44
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
        int  totalLemonCupcakes = 53;
        int leftAtHome = 2;
        int eachBoxesCupcakes = 3;
        int cupCakesGivenAway = totalLemonCupcakes - leftAtHome;
        int boxesGivenAway = cupCakesGivenAway / eachBoxesCupcakes;
        System.out.println("Boxes number of givenaway is "+ boxesGivenAway);

        /* Exercise 45
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
        int totalNumberOfCarrotSticks = 74;
        int numberOfPeople = 12;
        int carrotStickLeft = totalNumberOfCarrotSticks % numberOfPeople;
        System.out.println("Uneaten Carrots number is"+ carrotStickLeft);


        /* Exercise 46
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
        int totalGatheredTeddy = 98;
        int shelfCarryNumberTeddy = 7;
        int numbersOfShelves = totalGatheredTeddy / shelfCarryNumberTeddy;
        System.out.println("Number of shelve can carry is"+ numbersOfShelves);


        /* Exercise 47
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
        int numberOfPictures =  480;
        int picturesContainInAnAlbum = 20;
        int neededNumberOfAlbums = numberOfPictures / picturesContainInAnAlbum;
        System.out.println("Susie's mother needed albums number is "+ neededNumberOfAlbums);


        /* Exercise 48
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
        int tradingCardScatterNumber = 94;
        int aBoxHoldCards = 8;
        int boxesNumberOfFilled = tradingCardScatterNumber - aBoxHoldCards;
        System.out.println("Care number of filled is"+ boxesNumberOfFilled);
        System.out.println(" Unfilled Cards number is"+ tradingCardScatterNumber % aBoxHoldCards);


        /* Exercise 49
        49. The Milky Way galaxy contains 300 billion stars. The Andromeda galaxy
        contains 1 trillion stars. How many stars do the two galaxies contain combined?
        */
        BigInteger milkyWayGalaxyCOntainStars = new BigInteger ("300000000000");
        BigInteger andromedaGalaxyContainsStars = new BigInteger("1000000000000");
        BigInteger TotalCombinedStars = milkyWayGalaxyCOntainStars.add (andromedaGalaxyContainsStars);
        System.out.println("Two Galaxies contain combined stars is"+ TotalCombinedStars);



        /* Exercise 50
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
        int backedCroissants = 17;
        int guestNumber = 7;
        int serveToGuest = backedCroissants / guestNumber;
        System.out.println("Cristina serve croissants equally to her guest is "+ serveToGuest);

	    /* Exercise 51
	    51. Bill and Jill are house painters. Bill can paint a standard room in 2.15 hours, while Jill averages
	    1.90 hours. How long will it take the two painters working together to paint 5 standard rooms?
	    Hint: Calculate the rate at which each painter can complete a room (rooms / hour), combine those rates, 
	    and then divide the total number of rooms to be painted by the combined rate.
	    */
        double billRate = 1 / 2.15;
        double jillRate = 1/ 1.90;
        int  totalRooms = 5;
        double combinedRate = billRate + jillRate;
        double timetoPaint = totalRooms / combinedRate;
        System.out.println(" Total number of rooms to be painted by combined rate"+ timetoPaint);

     

	    /* Exercise 52
	    52. Create and assign variables to hold a first name, last name, and middle initial. Using concatenation,
		build an additional variable to hold the full name in the order of last name, first name, middle initial. The
		last and first names should be separated by a comma followed by a space, and the middle initial must end
		with a period. Use "Grace", "Hopper, and "B" for the first name, last name, and middle initial.
		Example: "John", "Smith, "D" —> "Smith, John D."
	    */
        String firstName = "Grace";
        String lastName = "Hopper";
        String middleName = "B";
        String fullName = lastName + ", " + firstName + " " + middleName + ".";
        System.out.println("The fullName is"+ fullName);


	    /* Exercise 53
	    53. The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
	    What percentage of the trip as a whole number has been completed?
	    */
        int totalDistance = 800;
        int travelledDistance = 537;
        int percentageCompleted = (537*100)/totalDistance;
        System.out.println("completed travel in percentage"+ percentageCompleted);

	}

}
