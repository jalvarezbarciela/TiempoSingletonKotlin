import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

object Tiempo {

    var doc: Document = Jsoup.connect("https://weather.com/es-ES/tiempo/hoy/l/SPXX0084:1:SP").userAgent("Mozilla").get()
    var temperatura: Elements = doc.getElementsByClass("today_nowcard-temp")
    var miTemperatura: String = temperatura.text()
    var tiempo: Elements = doc.getElementsByClass("today_nowcard-phrase")
    var miTiempo: String = tiempo.text()
    var NombrePagina: String? = doc.title()
 fun imprimir(){
     println(miTemperatura)
     println(miTiempo)
     println(NombrePagina)
 }

}