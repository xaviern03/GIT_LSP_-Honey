package org.howard.edu.lsp.oopfinal.question1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.Set;
import org.junit.jupiter.api.BeforeEach;

class SongDatabaseTest {
	   private SongsDatabase db;

	    @BeforeEach
	    void setUp() {
	        db = new SongsDatabase();
	        db.addSong("Rap", "Savage");
	        db.addSong("Country", "Sweet Alabama");
	        db.addSong("Jazz", "Always There");
	    }

	    @Test
	    void testAddSong() {
	        db.addSong("Rap", "Gin and Juice");
	        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
	    }

	    @Test
	    void testGetGenreOfSong() {
	        assertEquals("Rap", db.getGenreOfSong("Savage"));
	        assertEquals("Jazz", db.getGenreOfSong("Always There"));
	        assertNull(db.getGenreOfSong("Unknown Song"));
	    }

	    @Test
	    void testGetSongs() {
	        Set<String> rapSongs = db.getSongs("Rap");
	        assertTrue(rapSongs.contains("Savage"));
	        assertEquals(1, rapSongs.size());  // Check the number of songs in the Rap genre
	    }

}
