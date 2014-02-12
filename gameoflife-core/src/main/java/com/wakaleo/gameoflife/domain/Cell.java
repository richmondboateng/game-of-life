<<<<<<< HEAD
//package com.wakaleo.gameoflife.domain;

//public enum Cell {
=======
Richpackage com.wakaleo.gameoflife.domain;

Richpublic enum Cell {
>>>>>>> df3be85297654083eea962818d8bacf7189bb849
    LIVE_CELL("+"), DEAD_CELL(".");

    Richprivate String symbol;

    private Cell(final String initialSymbol) {
        this.symbol = initialSymbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    static Cell fromSymbol(final String symbol) {
        Cell cellRepresentedBySymbol = null;
        for (Cell cell : Cell.values()) {
            if (cell.symbol.equals(symbol)) {
                cellRepresentedBySymbol = cell;
                break;
            }
        }
        return cellRepresentedBySymbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
