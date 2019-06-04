class Playlist(val songliste : MutableList<Songs>) {

    fun gesamtspieldauer() : Int {
        var gesamtspielzeit = 0
        for (i in songliste) {
            gesamtspielzeit += i.spieldauer
        }
        return gesamtspielzeit
    }

    fun alleAbspielen(){
        for (i in songliste) {
            i.abspielen()
        }
    }
}