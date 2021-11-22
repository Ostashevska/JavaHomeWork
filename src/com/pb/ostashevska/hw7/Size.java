package com.pb.ostashevska.hw7;

   enum Size {

        L ("l",40),
        M ("m",38),
        S ("s",36),
        XS ("xs",34),
        XXS ("xxs",32);

            Size size = this.size;

            Size( String description, int euroSize) {
               this.description = description;
               this.euroSize = euroSize;
            }

            public int euroSize;
            public String description;

            public String getDescription() {
                switch (size) {
                    case XXS:
                        System.out.println("Дитячий розмір ");
                        break;
                    case XS:
                    case S:
                    case M:
                    case L:
                        System.out.println("Дорослий розмір ");
                        break;
                    default:
                        
                }  return null;
            }

            public int getEuroSize() {
                switch (size) {
                    case XXS:
                        return 32;
                    case XS:
                        return 34;
                    case S:
                        return 36;
                    case M:
                        return 38;
                    case L:
                        return 40;
                }
                return 0;
            }

        }

