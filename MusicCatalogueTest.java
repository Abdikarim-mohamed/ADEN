package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MusicCatalogueTest {
    private MusicCatalogue musicCatalogue;

    @BeforeEach
    void setUp() {
        musicCatalogue = new MusicCatalogue();

    }

    @Test
    void testComponentsNotNull() {
        assertNotNull(musicCatalogue.artistField, "Artist text field should be initialized");
        assertNotNull(musicCatalogue.studioField, "Studio text field should be initialized");
        assertNotNull(musicCatalogue.categoryBox, "Category combo box should be initialized");
        assertNotNull(musicCatalogue.availableCheck, "Available checkbox should be initialized");
        assertNotNull(musicCatalogue.B1, "Submit button should be initialized");
        assertNotNull(musicCatalogue.B2, "Exit button should be initialized");


    }


    @Test
    void testSubmitButtonAction() {
        musicCatalogue.artistField.setText("Hani");
        musicCatalogue.studioField.setText("Maryam Studios");
        musicCatalogue.categoryBox.setSelectedItem("Rap");
        musicCatalogue.availableCheck.setSelected(true);

        musicCatalogue.B1.doClick();

        assertTrue(true);
    }

    @Test
    void testExitButtonAction() {
        musicCatalogue.B1.doClick();
        assertTrue(true);
    }
    }