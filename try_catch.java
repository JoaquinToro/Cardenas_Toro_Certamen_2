public int ValidarEstado(){

        try{
            String cadena = Entrada.next();
        if(cadena.matches("[1-3]*"))
            return Integer.parseInt(cadena);
        else
           System.out.println("Dato no válido, introduzca un valor 1,2,3");
        }catch(NumberFormatException e){
           System.out.println("Este dato no es válido"); 
        }
        return 0;
    }
