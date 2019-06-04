class Songs (val titel : String, val interpret : String, val spieldauer: Int, bewertung_param : Int ) { // ÄNDERN Bewertung darf nicht unter 0 und über 100 erstellt werden

    var bewertung = bewertung_param
//    set(value) {
//            if (value < 0) field = 0
//            if (value > 100) field = 100
//            if (value <= 100 && value >= 0 ) field = value
//     }

    init {
        if (bewertung < 0) bewertung = 0
        if (bewertung > 100) bewertung = 100
        if (bewertung <= 100 && bewertung >= 0 ) bewertung
    }

    fun abspielen() {
        for (i in 0..spieldauer / 60) { // Schleife bis angefangene Minute
            println("Spiele: $titel von $interpret (Bewertung: $bewertung Punkte)")
        }
    }

    // Überprüft, ob die übergebene Bewertung kleiner als 0 oder größer als 100 ist, da sie dann auf 0 oder 100 gesetzt wird. Sonst auf die übergebene Bewertung.
    fun bewertungAendern(bewertung: Int) = if (bewertung > 100) this.bewertung = 100 else if (bewertung < 0) this.bewertung = 0 else this.bewertung = bewertung

    // Überprüft, ob der Suchbegriff in dem Titel oder dem Interpreten vor kommt. Gibt true oder false zurück
    fun suchbegriffUeberpruefen(s : String) : Boolean = (titel.contains(s) || interpret.contains(s))
}