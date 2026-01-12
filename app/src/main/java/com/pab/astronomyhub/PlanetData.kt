package com.pab.astronomyhub

object PlanetData {
    val listPlanet: ArrayList<Planet>
        get() {
            val list = arrayListOf<Planet>()
            list.add(Planet("Matahari",
                "Bintang pusat tata surya.",
                "Matahari adalah bola gas raksasa yang sangat panas. Tanpa Matahari, kehidupan di Bumi tidak akan pernah ada.",
                "0 km",
                "5.505°C",
                "-",
                R.drawable.img_matahari))

            list.add(Planet("Merkurius",
                "Planet terkecil.",
                "Merkurius adalah planet yang paling dekat dengan Matahari. Planet ini tidak memiliki atmosfer yang signifikan.",
                "57.9 Juta km",
                "430°C",
                "88 Hari",
                R.drawable.img_merkurius))

            list.add(Planet("Venus",
                "Planet paling panas.",
                "Atmosfernya sangat tebal dan beracun, menjebak panas yang membuatnya lebih panas dari Merkurius.",
                "108.2 Juta km",
                "471°C",
                "225 Hari",
                R.drawable.img_venus))

            list.add(Planet("Bumi",
                "Tempat tinggal kita.",
                "Satu-satunya planet yang diketahui memiliki kehidupan dan air dalam bentuk cair.",
                "149.6 Juta km",
                "15°C",
                "365 Hari",
                R.drawable.img_bumi))

            list.add(Planet("Bulan",
                "Satelit alami Bumi.",
                "Bulan mempengaruhi pasang surut air laut dan menstabilkan kemiringan sumbu rotasi Bumi.",
                "384.400 km",
                "-20°C",
                "27 Hari",
                R.drawable.img_bulan))

            list.add(Planet("Mars",
                "Planet Merah.",
                "Memiliki gunung tertinggi di tata surya, Olympus Mons, dan tanda-tanda air di masa lalu.",
                "227.9 Juta km",
                "-65°C",
                "687 Hari",
                R.drawable.img_mars))

            list.add(Planet("Jupiter",
                "Planet terbesar.",
                "Raksasa gas dengan bintik merah raksasa yang merupakan badai besar yang berlangsung berabad-abad.",
                "778.5 Juta km",
                "-110°C",
                "12 Tahun",
                R.drawable.img_jupiter))

            list.add(Planet("Saturnus",
                "Planet bercincin.",
                "Terkenal dengan sistem cincin yang spektakuler yang terdiri dari bongkahan es dan debu.",
                "1.4 Miliar km",
                "-140°C",
                "29 Tahun",
                R.drawable.img_saturnus))

            list.add(Planet("Neptunus",
                "Planet terjauh.",
                "Planet raksasa es yang berwarna biru gelap dengan angin yang sangat kencang.",
                "4.5 Miliar km",
                "-201°C",
                "165 Tahun",
                R.drawable.img_neptunus))
            return list
        }
}