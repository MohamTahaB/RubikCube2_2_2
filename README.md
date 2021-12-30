# RubikCube2_2_2

Description of the project :

It's a program that enables the user, to find the minimum movements to go from a state A of a Rubik cube 2*2*2 to a solved state, using a naive perspective as to which, according to a Google's team of researchers, the cube can be solved from any position in 20 moves or less. So naively we would refer to BFS using every possible movement (rotation clkwise and anticlkwise of every face : total of 12 moves)

The problem that we face is complexity : 12^20 is gigantic; this is why I'll store results and at every iteration of BFS, allow the search to continue in the considered branch only if it comes with a new result that would be strored as well. Otherwise, that branch chuts down.

To gain time in coding and debugging, the clkwise moves will be coded from scratch, but the anticlkwise moves would be a 3-times-iteration of the clkwise move.
