package com.gymfox.designerPDFviewer;

import org.junit.Test;

import static com.gymfox.designerPDFviewer.Solution.designerPdfViewer;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void designerPdfViewerTest() {
        assertEquals(9, designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5},
                "abc"));
        assertEquals(28, designerPdfViewer(new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5,
                        5, 5, 5, 7}, "zaba"));
    }
}