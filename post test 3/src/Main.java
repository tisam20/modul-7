class Produk {
    int harga = 10000;
}

class Buku extends Produk {
    int harga = 25000;

    void bandingkanHarga() {
        System.out.println("Harga subclass (buku): " + harga);
        System.out.println("Harga superclass (produk): " + super.harga);
    }
}

public class Main {
    public static void main(String[] args) {
        Buku b = new Buku();
        b.bandingkanHarga();
    }
}
