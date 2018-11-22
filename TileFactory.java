
/**
 *
 * @author R. Springer
 */
public class TileFactory {

    /**
     * Creates a Tile object based on the mapIcon number you give
     *
     * @param mapIcon number
     * @return Tile tile object
     */
    public static Tile createTile(int mapIcon) {
        Tile tile;
        switch (mapIcon) {
            case 35:
                tile = new Tile("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 42:
                tile = new Tile("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 130:
                tile = new Tile("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 146:
                tile = new Tile("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 147:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 148:
                tile = new Tile("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 132:
                tile = new Tile("grassCliffLeft.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 134:
                tile = new Tile("grassCliffRight.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 136:
                tile = new Tile("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 195:
                tile = new Tile("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 197:
                tile = new Water("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 228:
                tile = new Tile("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 0:
                tile = new Tile("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 1:
                tile = new Tile("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 54:
                tile = new Tile("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 74:
                tile = new Tile("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 223:
                tile = new Tile("plant.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 79:
                tile = new coinSilver("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 78:
                tile = new coinGold("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 8:
                tile = new Tile("snailWalk2.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
            case 47:
                tile = new Tile("buttonGreen_pressed.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
               tile.getImage().mirrorVertically();
                tile.isSolid = true;
                break;
            case 43:
                tile = new Tile("bush.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 164:
                tile = new Tile("hud_gem_blue.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 126:
                tile = new gemGreen("gemGreen.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 227:
                tile = new Tile("rock.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 187:
                tile = new keyGreen("keyGreen.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 103:
                tile = new DoorOpenMid ("door_openMid.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 104:
                tile = new Tile("door_openTop.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 101:
                tile = new Tile("door_closedMid.png" ,TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 102:
                tile = new DoorOpenTop("door_closedTop.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 202:
                tile = new Tile("mushroomRed.png" , TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            case 73:
                tile = new Tile("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}


