import java.util.Arrays;

/**
 * Model a 1D elementary cellular automaton.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.1
 */
public class Automaton
{
    // The number of cells.
    private final int numberOfCells;
    // The state of the cells.
    private int[] state;
    
/**
     * Create a 1D automaton consisting of the given number of cells.
     * @param numberOfCells The number of cells in the automaton.
     */
    public Automaton(int numberOfCells)
    {
        this.numberOfCells = numberOfCells;
        state = new int[numberOfCells];
        state = new int[numberOfCells + 1];
        state[numberOfCells / 2] = 1;
    }
    
/**
     * Print the current state of the automaton.
     */
    public void print()
    {
        for(int i=0; i< numberOfCells; i++){
            System.out.print(state[i] == 1 ? "*" : " ");
        }
        System.out.println();
    }   
    
    /**
     * Update the automaton to its next state.
     */
    public void update()
    {
        int[] nextState = new int[state.length];
        
        int left = 0;
        int center = state[0];
    for (int i=0; i<numberOfCells; i++){
        int right = state[i+1];
        nextState[i] = calculateNextState(left,center,right);
        left = center;
        center = right;
        
    }
    state = nextState;
}

private int calculateNextState(int left, int center, int right){
        return (left + center + right) % 2;
    }
/**
     * Reset the automaton.
     */
    public void reset()
    {
        Arrays.fill(state, 0);
        int middle = numberOfCells / 2;
        if (middle - 1 >=0) state[middle - 1] = 1;
        state[middle] = 1;
        if (middle + 1 < numberOfCells) state[middle + 1] = 1;
    }
}
