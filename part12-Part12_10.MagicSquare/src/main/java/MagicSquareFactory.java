
public class MagicSquareFactory {
    
    public MagicSquare createMagicSquare(int size) {
 
        MagicSquare square = new MagicSquare(size);
 
        // implement the creation of a magic square with the Siamese method algorithm here
        int x = size / 2;
        int y = 0;
 
        int number = 1;
        int numbers = size * size;
 
        while (number <= numbers) {
            square.placeValue(x, y, number);
 
            // is the position to the top right free
            // get the position
            int candidateY = y - 1;
            int candidateX = x + 1;
 
            if (candidateY < 0) {
                candidateY += size;
            }
 
            if (candidateX >= size) {
                candidateX %= size;
            }
 
            // if the position is free, we'll place the number there
            if (square.readValue(candidateX, candidateY) == 0) {
                x = candidateX;
                y = candidateY;
            } else {
                // the position is not free, so we move "down"
                y++;
                if (y >= size) {
                    y = 0;
                }
            }
 
            number++;
 
        }
 
        return square;
    }

//    public MagicSquare createMagicSquare(int size) {
//
//        MagicSquare square = new MagicSquare(size);
//        int x = square.getWidth() / 2;
//        int y = 0;
//        
//        int value = 1;
//        
//        square.placeValue(x, y, value);
//        
//        while (value <= square.getWidth() * square.getHeight()) {
//            value += 1;
//            if (square.readValue(x + 1, y - 1) == -1) {
//               int tempX = 0;
//               int tempY = 0;
//               
//                if (y == 0 && x == (square.getWidth() - 1)) {
//                    tempX = 0;
//                    tempY = square.getHeight() - 1;
//                } else if (y == 0) {
//                    tempX = x + 1;
//                    tempY = square.getHeight() - 1;
//                } else  if (x == (square.getWidth() - 1)) {
//                    tempX = 0;
//                    tempY = y - 1;
//                }
//               
//               if (square.readValue(tempX, tempY) > 0) {
//                   y += 1;
//               } else {
//                   x = tempX;
//                   y = tempY;
//               }
//            } else if (square.readValue(x + 1, y - 1) > 0) {
//                y += 1;
//            } else {
//                x += 1;
//                y -= 1;
//            }
//            
//            if (square.readValue(x, y) == 0) {
//                square.placeValue(x, y, value);
//                continue;
//            }     
//        }
//        
//        return square;
//    }
    
    
    
}
