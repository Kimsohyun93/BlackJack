var deck:Deck = Deck(8)
var thisNumber = 0

fun main(){
    var dealer:Player = Player()
    var user:Player = Player()

    user.hit(drawCard())
    dealer.hit(drawCard())

    user.hit(drawCard())
    dealer.hit(drawCard())

//    var cards:ArrayList<Card> = ArrayList()
//    for(i in 1..52){
//        cards.add(Card(i))
//    }
//    cards.shuffle()
//    for(c in cards){
//        println(c.toString())
//    }
}

fun drawCard() : Card{
    return deck.cards[thisNumber++]
}