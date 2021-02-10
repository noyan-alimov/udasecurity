module security {
    requires java.desktop;
    requires java.prefs;
    requires com.google.gson;
    requires com.google.common;
    requires image;
    requires miglayout;
    opens com.udacity.security.data to com.google.gson;
}