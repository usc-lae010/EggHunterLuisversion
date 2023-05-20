package egghunt.engine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestGameEngine {
    private GameEngine gameEngine;

    @BeforeEach
    public void setup() {
        gameEngine = new GameEngine();
    }

    @Test
    public void testValidateDifficulty_ValidDifficulty() {
        int validDifficulty = 5;
        assertDoesNotThrow(() -> gameEngine.validateDifficulty(validDifficulty));
    }

    @Test
    public void testValidateDifficulty_InvalidDifficulty() {
        int invalidDifficulty = -5;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () ->
                gameEngine.validateDifficulty(invalidDifficulty));
        assertEquals("Invalid difficulty level. Please enter a value between 0 and 10.", exception.getMessage());
    }

    @Test
    public void testSetupMaze() {
        gameEngine.setupMaze();
        boolean[][] maze = gameEngine.getMaze();
        assertNotNull(maze);
        assertEquals(GameEngine.MAZE_SIZE, maze.length);
        assertEquals(GameEngine.MAZE_SIZE, maze[0].length);
        for (int i = 0; i < GameEngine.MAZE_SIZE; i++) {
            for (int j = 0; j < GameEngine.MAZE_SIZE; j++) {
                assertTrue(maze[i][j]);
            }
        }
    }

    // Add more tests for other methods...

    // Example test for movePlayer method
    @Test
    public void testPlayerMovement() {
        GameEngine gameEngine = new GameEngine();
        // Test initial player position
        Assertions.assertEquals(0, gameEngine.getPlayerX());

        // Test moving player to the right
        gameEngine.movePlayer("right");
        Assertions.assertEquals(1, gameEngine.getPlayerX());

        // Test moving player to the left
        gameEngine.movePlayer("left");
        Assertions.assertEquals(0, gameEngine.getPlayerX());

        // Test moving player up and down
        gameEngine.movePlayer("up");
        Assertions.assertEquals(0, gameEngine.getPlayerX());

        gameEngine.movePlayer("down");
        Assertions.assertEquals(0, gameEngine.getPlayerX());
    }
}

    // Example test for playGame method




