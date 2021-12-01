package me.eltacshikhsaidov.external.random;

import java.util.Random;

public class Generate {
    public static int random() {
        Random random = new Random();
        int low = 16;
        int high = 17;
        return random.nextInt(high - low) + low;
    }
}

/*


How many airplanes are there: 8
Enter name of plane 0 : p1
Enter name of plane 1 : p2
Enter name of plane 2 : p3
Enter name of plane 3 : p4
Enter name of plane 4 : p5
Enter name of plane 5 : p6
Enter name of plane 6 : p7
Enter name of plane 7 : p8
-----------------------------
How many cities are there: 9
Enter name of city 0 : baku
Enter name of city 1 : berlin
Enter name of city 2 : moscow
Enter name of city 3 : london
Enter name of city 4 : paris
Enter name of city 5 : istanbul
Enter name of city 6 : krakow
Enter name of city 7 : mexico
Enter name of city 8 : tokyo
-----------------------------
When the first plane starts its flight: 8:00
-----------------------------
Enter arriving hour from baku to berlin for p1: 3
Enter arriving hour from baku to moscow for p1: 2
Enter arriving hour from baku to london for p1: 5
Enter arriving hour from baku to paris for p1: 5
Enter arriving hour from baku to istanbul for p1: 2
Enter arriving hour from baku to krakow for p1: 4
Enter arriving hour from baku to mexico for p1: 13
Enter arriving hour from baku to tokyo for p1: 7
Enter arriving hour from baku to berlin for p2: 3
Enter arriving hour from baku to moscow for p2: 2
Enter arriving hour from baku to london for p2: 5
Enter arriving hour from baku to paris for p2: 5
Enter arriving hour from baku to istanbul for p2: 2
Enter arriving hour from baku to krakow for p2: 4
Enter arriving hour from baku to mexico for p2: 13
Enter arriving hour from baku to tokyo for p2: 7
Enter arriving hour from baku to berlin for p3: 3
Enter arriving hour from baku to moscow for p3: 2
Enter arriving hour from baku to london for p3: 5
Enter arriving hour from baku to paris for p3: 5
Enter arriving hour from baku to istanbul for p3: 2
Enter arriving hour from baku to krakow for p3: 4
Enter arriving hour from baku to mexico for p3: 13
Enter arriving hour from baku to tokyo for p3: 7
Enter arriving hour from baku to berlin for p4: 3
Enter arriving hour from baku to moscow for p4: 2
Enter arriving hour from baku to london for p4: 5
Enter arriving hour from baku to paris for p4: 5
Enter arriving hour from baku to istanbul for p4: 2
Enter arriving hour from baku to krakow for p4: 4
Enter arriving hour from baku to mexico for p4: 13
Enter arriving hour from baku to tokyo for p4: 7
Enter arriving hour from baku to berlin for p5: 3
Enter arriving hour from baku to moscow for p5: 2
Enter arriving hour from baku to london for p5: 5
Enter arriving hour from baku to paris for p5: 5
Enter arriving hour from baku to istanbul for p5: 2
Enter arriving hour from baku to krakow for p5: 4
Enter arriving hour from baku to mexico for p5: 13
Enter arriving hour from baku to tokyo for p5: 7
Enter arriving hour from baku to berlin for p6: 3
Enter arriving hour from baku to moscow for p6: 2
Enter arriving hour from baku to london for p6: 5
Enter arriving hour from baku to paris for p6: 5
Enter arriving hour from baku to istanbul for p6: 2
Enter arriving hour from baku to krakow for p6: 4
Enter arriving hour from baku to mexico for p6: 13
Enter arriving hour from baku to tokyo for p6: 7
Enter arriving hour from baku to berlin for p7: 3
Enter arriving hour from baku to moscow for p7: 2
Enter arriving hour from baku to london for p7: 5
Enter arriving hour from baku to paris for p7: 5
Enter arriving hour from baku to istanbul for p7: 2
Enter arriving hour from baku to krakow for p7: 4
Enter arriving hour from baku to mexico for p7: 13
Enter arriving hour from baku to tokyo for p7: 7
Enter arriving hour from baku to berlin for p8: 3
Enter arriving hour from baku to moscow for p8: 2
Enter arriving hour from baku to london for p8: 5
Enter arriving hour from baku to paris for p8: 5
Enter arriving hour from baku to istanbul for p8: 2
Enter arriving hour from baku to krakow for p8: 4
Enter arriving hour from baku to mexico for p8: 13
Enter arriving hour from baku to tokyo for p8: 7
╔══════╤═════════════════════════════════════════════════════════╤═════════════════════════════════════════════════════════╤═════════════════════════════════════════════════════════╤══════════════════════════════════════════════════════════╤══════════════════════════════════════════════════════════╤══════════════════════════════════════════════════════════╤════════════════════════════════════════════════════════════╤═════════════════════════════════════════════════════════╤═════════════════════════════════════════════════════════╗
║  --  │ BAKU                                                    │ BERLIN to BAKU                                          │ MOSCOW to BAKU                                          │ LONDON to BAKU                                           │ PARIS to BAKU                                            │ ISTANBUL to BAKU                                         │ KRAKOW to BAKU                                             │ MEXICO to BAKU                                          │ TOKYO to BAKU                                           ║
╠══════╪═════════════════════════════════════════════════════════╪═════════════════════════════════════════════════════════╪═════════════════════════════════════════════════════════╪══════════════════════════════════════════════════════════╪══════════════════════════════════════════════════════════╪══════════════════════════════════════════════════════════╪════════════════════════════════════════════════════════════╪═════════════════════════════════════════════════════════╪═════════════════════════════════════════════════════════╣
║ P1   │ Area: 1, Flight time from Baku: 08:00, Week Day: Monday │ Area: 2, Arriving time to Baku: 14:16, Week Day: Monday │ Area: 1, Arriving time to Baku: 18:32, Week Day: Monday │ Area: 2, Arriving time to Baku: 04:48, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 15:04, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 19:20, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 03:36, Week Day: Wednesday │ Area: 2, Arriving time to Baku: 05:52, Week Day: Friday │ Area: 1, Arriving time to Baku: 20:08, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P2   │ Area: 2, Flight time from Baku: 08:00, Week Day: Monday │ Area: 1, Arriving time to Baku: 14:16, Week Day: Monday │ Area: 2, Arriving time to Baku: 18:32, Week Day: Monday │ Area: 1, Arriving time to Baku: 04:48, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 15:04, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 19:20, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 03:36, Week Day: Wednesday │ Area: 1, Arriving time to Baku: 05:52, Week Day: Friday │ Area: 2, Arriving time to Baku: 20:08, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P3   │ Area: 1, Flight time from Baku: 08:15, Week Day: Monday │ Area: 2, Arriving time to Baku: 14:31, Week Day: Monday │ Area: 1, Arriving time to Baku: 18:47, Week Day: Monday │ Area: 2, Arriving time to Baku: 05:03, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 15:19, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 19:35, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 03:51, Week Day: Wednesday │ Area: 2, Arriving time to Baku: 06:07, Week Day: Friday │ Area: 1, Arriving time to Baku: 20:23, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P4   │ Area: 2, Flight time from Baku: 08:15, Week Day: Monday │ Area: 1, Arriving time to Baku: 14:31, Week Day: Monday │ Area: 2, Arriving time to Baku: 18:47, Week Day: Monday │ Area: 1, Arriving time to Baku: 05:03, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 15:19, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 19:35, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 03:51, Week Day: Wednesday │ Area: 1, Arriving time to Baku: 06:07, Week Day: Friday │ Area: 2, Arriving time to Baku: 20:23, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P5   │ Area: 1, Flight time from Baku: 08:30, Week Day: Monday │ Area: 2, Arriving time to Baku: 14:46, Week Day: Monday │ Area: 1, Arriving time to Baku: 19:02, Week Day: Monday │ Area: 2, Arriving time to Baku: 05:18, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 15:34, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 19:50, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 04:06, Week Day: Wednesday │ Area: 2, Arriving time to Baku: 06:22, Week Day: Friday │ Area: 1, Arriving time to Baku: 20:38, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P6   │ Area: 2, Flight time from Baku: 08:30, Week Day: Monday │ Area: 1, Arriving time to Baku: 14:46, Week Day: Monday │ Area: 2, Arriving time to Baku: 19:02, Week Day: Monday │ Area: 1, Arriving time to Baku: 05:18, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 15:34, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 19:50, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 04:06, Week Day: Wednesday │ Area: 1, Arriving time to Baku: 06:22, Week Day: Friday │ Area: 2, Arriving time to Baku: 20:38, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P7   │ Area: 1, Flight time from Baku: 08:45, Week Day: Monday │ Area: 2, Arriving time to Baku: 15:01, Week Day: Monday │ Area: 1, Arriving time to Baku: 19:17, Week Day: Monday │ Area: 2, Arriving time to Baku: 05:33, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 15:49, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 20:05, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 04:21, Week Day: Wednesday │ Area: 2, Arriving time to Baku: 06:37, Week Day: Friday │ Area: 1, Arriving time to Baku: 20:53, Week Day: Friday ║
╟──────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼──────────────────────────────────────────────────────────┼────────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────┼─────────────────────────────────────────────────────────╢
║ P8   │ Area: 2, Flight time from Baku: 08:45, Week Day: Monday │ Area: 1, Arriving time to Baku: 15:01, Week Day: Monday │ Area: 2, Arriving time to Baku: 19:17, Week Day: Monday │ Area: 1, Arriving time to Baku: 05:33, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 15:49, Week Day: Tuesday │ Area: 1, Arriving time to Baku: 20:05, Week Day: Tuesday │ Area: 2, Arriving time to Baku: 04:21, Week Day: Wednesday │ Area: 1, Arriving time to Baku: 06:37, Week Day: Friday │ Area: 2, Arriving time to Baku: 20:53, Week Day: Friday ║
╚══════╧═════════════════════════════════════════════════════════╧═════════════════════════════════════════════════════════╧═════════════════════════════════════════════════════════╧══════════════════════════════════════════════════════════╧══════════════════════════════════════════════════════════╧══════════════════════════════════════════════════════════╧════════════════════════════════════════════════════════════╧═════════════════════════════════════════════════════════╧═════════════════════════════════════════════════════════╝


*/
