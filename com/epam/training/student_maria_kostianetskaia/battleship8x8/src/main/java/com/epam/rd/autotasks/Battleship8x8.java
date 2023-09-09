package com.epam.rd.autotasks;

public class Battleship8x8 {
    private final long ships;
    private long shots = 0L;

    public Battleship8x8(final long ships) {
        this.ships = ships;
    }

    public boolean shoot(String shot) {
        long newShot = 0b10000000_00000000_00000000_00000000_00000000_00000000_00000000_00000000L;
        switch (shot.charAt(0)) {
            case 'A': break;
            case 'B': {newShot >>>= 1; break;}
            case 'C': {newShot >>>= 2; break;}
            case 'D': {newShot >>>= 3; break;}
            case 'E': {newShot >>>= 4; break;}
            case 'F': {newShot >>>= 5; break;}
            case 'G': {newShot >>>= 6; break;}
            case 'H': {newShot >>>= 7; break;}
        }
        newShot >>>= (8 * (shot.charAt(1) - 1));
        shots |= newShot;
        return (ships & newShot) != 0;

    }
    public String state() {
        String strShips = String.format("%64s", Long.toBinaryString(ships)).replace(' ', '0');
        String strShots = String.format("%64s", Long.toBinaryString(shots)).replace(' ', '0');

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < strShots.length(); i++) {
            if (i % 8 == 0 && i != 0)
                result.append("\n");

            char shipChar = strShips.charAt(i);
            char shotChar = strShots.charAt(i);

            if (shipChar == '0' && shotChar == '0')
                result.append(".");
            else if (shipChar == '0' && shotChar == '1')
                result.append("×");
            else if (shipChar == '1' && shotChar == '0')
                result.append("☐");
            else if (shipChar == '1' && shotChar == '1')
                result.append("☒");
        }
        return result.toString();
    }
}