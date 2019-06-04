fun main() {
    // Musikverwaltung
    val bibList = mutableListOf<Songs>()
    val mv = Musikverwaltung(bibList)

    var one = Songs("One", "Metallica", 300, 170)
    var warriors = Songs("Warriors", "Imagine Dragons", 256, -100)
    var rome = Songs("Rome", "Blackout Problems", 128, 15)
    var people = Songs("People", "Leoniden", 315, 95)
    var goodbye = Songs("Goodbye", "SR-71", 180, 60)
    var mother = Songs("Mother", "Lissie", 400, 90)
    var happyHome = Songs("Happy Home", "Lukas Graham", 440, 99)
    var sevenYears = Songs("7 Years", "Lukas Graham", 330, 100)

    mv.addSong(one)
    mv.addSong(warriors)
    mv.addSong(rome)
    mv.addSong(people)
    mv.addSong(goodbye)
    mv.addSong(mother)
    mv.addSong(happyHome)
    mv.addSong(sevenYears)

    // Liste für Playlist
    val songliste = mutableListOf<Songs>()
    songliste.add(one)
    songliste.add(people)
    songliste.add(happyHome)
    // Übergibt die Liste für die Playlist und erstellt diese
    val bestofZenska = Playlist(songliste)

    // Zufällige Playlist erstellen
    val zufallsplaylist = mv.zufallPlaylist()

    // Beide Playlists abspielen
    println("Eigene Playlist:")
    bestofZenska.alleAbspielen()
    println()
    println("Zufällige Playlist:")
    zufallsplaylist.alleAbspielen()

    // Bester Song
    println()
    println("Bester Song: ")
    println("Bester Song: ${mv.bestSong().titel} von ${mv.bestSong().interpret} mit ${mv.bestSong().bewertung} Punkten")
    println()

    do {

        println("Bitte geben Sie einen Suchbegriff ein: ")
        val benutzereingabe = readLine().toString()
        if (benutzereingabe != "stopp") { // Damit nicht nochmal ein Song abgespielt wird, wenn man stopp eingegeben hat.
            val gefundenerSong: Songs = mv.searchSong(benutzereingabe)
            gefundenerSong.abspielen()
            println()
        }

    } while (benutzereingabe != "stopp")
}