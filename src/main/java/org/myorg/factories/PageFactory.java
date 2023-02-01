package org.myorg.factories;

import org.myorg.pages.FormPage;
import org.myorg.pages.Page;
import org.myorg.pages.SimplePage;

public class PageFactory {
    public Page Page(String file) {
        return new FormPage();
    }
}
