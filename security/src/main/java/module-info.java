module security {
    requires java.desktop;
    requires java.prefs;
    requires com.google.gson;
    requires com.google.common;
    requires image;
    requires miglayout;
    opens com.udacity.catpoint.data to com.google.gson;
}