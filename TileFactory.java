
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
            case 230:
  tile = new Tile ("blockerBody.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 231:
  tile = new Tile ("blockerMad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 232:
  tile = new Tile ("blockerSad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 233:
  tile = new Tile ("bomb.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 234:
  tile = new Tile ("bombFlash.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 235:
  tile = new Tile ("box.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 236:
  tile = new Tile ("boxAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 237:
  tile = new Tile ("boxCoin.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 238:
  tile = new Tile ("boxCoin_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 239:
  tile = new Tile ("boxCoinAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 240:
  tile = new Tile ("boxCoinAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 241:
  tile = new Tile ("boxEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 242:
  tile = new Tile ("boxExplosive.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 243:
  tile = new Tile ("boxExplosive_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 244:
  tile = new Tile ("boxExplosiveAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 245:
  tile = new Tile ("boxItem.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 246:
  tile = new Tile ("boxItem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 247:
  tile = new Tile ("boxItemAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 248:
  tile = new Tile ("boxItemAlt_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 249:
  tile = new Tile ("boxWarning.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 250:
  tile = new Tile ("brickWall.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 251:
  tile = new Tile ("bridge.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 252:
  tile = new Tile ("bridgeLogs.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 253:
  tile = new Tile ("bush.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 254:
  tile = new Tile ("buttonBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 255:
  tile = new Tile ("buttonBlue_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 256:
  tile = new Tile ("buttonGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 257:
  tile = new Tile ("buttonGreen_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 258:
  tile = new Tile ("buttonRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 259:
  tile = new Tile ("buttonRed_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 260:
  tile = new Tile ("buttonYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 261:
  tile = new Tile ("buttonYellow_pressed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 262:
  tile = new Tile ("cactus.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 263:
  tile = new Tile ("castle.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 264:
  tile = new Tile ("castleCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 265:
  tile = new Tile ("castleCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 266:
  tile = new Tile ("castleCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 267:
  tile = new Tile ("castleCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 268:
  tile = new Tile ("castleCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 269:
  tile = new Tile ("castleCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 270:
  tile = new Tile ("castleHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 271:
  tile = new Tile ("castleHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 272:
  tile = new Tile ("castleHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 273:
  tile = new Tile ("castleHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 274:
  tile = new Tile ("castleHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 275:
  tile = new Tile ("castleHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 276:
  tile = new Tile ("castleHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 277:
  tile = new Tile ("castleHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 278:
  tile = new Tile ("castleLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 279:
  tile = new Tile ("castleLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 280:
  tile = new Tile ("castleLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 281:
  tile = new Tile ("castleMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 282:
  tile = new Tile ("castleRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 283:
  tile = new Tile ("chain.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 284:
  tile = new Tile ("cloud1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 285:
  tile = new Tile ("cloud2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 286:
  tile = new Tile ("cloud3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 287:
  tile = new Tile ("coinBronze.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 288:
  tile = new coinGold ("coinGold.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 289:
  tile = new coinSilver ("coinSilver.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 290:
  tile = new Tile ("dirt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 291:
  tile = new Tile ("dirtCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 292:
  tile = new Tile ("dirtCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 293:
  tile = new Tile ("dirtCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 294:
  tile = new Tile ("dirtCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 295:
  tile = new Tile ("dirtCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 296:
  tile = new Tile ("dirtCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 297:
  tile = new Tile ("dirtHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 298:
  tile = new Tile ("dirtHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 299:
  tile = new Tile ("dirtHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 300:
  tile = new Tile ("dirtHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 301:
  tile = new Tile ("dirtHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 302:
  tile = new Tile ("dirtHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 303:
  tile = new Tile ("dirtHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 304:
  tile = new Tile ("dirtHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 305:
  tile = new Tile ("dirtLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 306:
  tile = new Tile ("dirtLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 307:
  tile = new Tile ("dirtLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 308:
  tile = new Tile ("dirtMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 309:
  tile = new Tile ("dirtRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 310:
  tile = new DoorOpenMid("door_closedMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 311:
  tile = new DoorOpenTop ("door_closedTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 312:
  tile = new Tile ("door_openMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 313:
  tile = new Tile ("door_openTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 314:
  tile = new Tile ("fence.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 315:
  tile = new Tile ("fenceBroken.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 316:
  tile = new Tile ("fireball.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 317:
  tile = new Tile ("fishDead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 318:
  tile = new Tile ("fishSwim1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 319:
  tile = new Tile ("fishSwim2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 320:
  tile = new Tile ("flagBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 321:
  tile = new Tile ("flagBlue2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 322:
  tile = new Tile ("flagBlueHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 323:
  tile = new Tile ("flagGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 324:
  tile = new Tile ("flagGreen2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 325:
  tile = new Tile ("flagGreenHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 326:
  tile = new Tile ("flagRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 327:
  tile = new Tile ("flagRed2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 328:
  tile = new Tile ("flagRedHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 329:
  tile = new Tile ("flagYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 330:
  tile = new Tile ("flagYellow2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 331:
  tile = new Tile ("flagYellowHanging.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 332:
  tile = new Tile ("flyDead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 333:
  tile = new Tile ("flyFly1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 334:
  tile = new Tile ("flyFly2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 335:
  tile = new Tile ("gemBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 336:
  tile = new gemGreen ("gemGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 337:
  tile = new Tile ("gemRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 338:
  tile = new Tile ("gemYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 339:
  tile = new Tile ("grass.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 340:
  tile = new Tile ("grassCenter.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 341:
  tile = new Tile ("grassCenter_rounded.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 342:
  tile = new Tile ("grassCliffLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 343:
  tile = new Tile ("grassCliffLeftAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 344:
  tile = new Tile ("grassCliffRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 345:
  tile = new Tile ("grassCliffRightAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 346:
  tile = new Tile ("grassHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 347:
  tile = new Tile ("grassHalfLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 348:
  tile = new Tile ("grassHalfMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 349:
  tile = new Tile ("grassHalfRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 350:
  tile = new Tile ("grassHillLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 351:
  tile = new Tile ("grassHillLeft2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 352:
  tile = new Tile ("grassHillRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 353:
  tile = new Tile ("grassHillRight2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 354:
  tile = new Tile ("grassLedgeLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 355:
  tile = new Tile ("grassLedgeRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 356:
  tile = new Tile ("grassLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 357:
  tile = new Tile ("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 358:
  tile = new Tile ("grassRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
  tile.isSolid = true;
 break;
 case 359:
  tile = new Tile ("hill_large.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 360:
  tile = new Tile ("hill_largeAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 361:
  tile = new Tile ("hill_small.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 362:
  tile = new Tile ("hill_smallAlt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 363:
  tile = new Tile ("hud_0.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 364:
  tile = new Tile ("hud_1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 365:
  tile = new Tile ("hud_2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 366:
  tile = new Tile ("hud_3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 367:
  tile = new Tile ("hud_4.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 368:
  tile = new Tile ("hud_5.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 369:
  tile = new Tile ("hud_6.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 370:
  tile = new Tile ("hud_7.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 371:
  tile = new Tile ("hud_8.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 372:
  tile = new Tile ("hud_9.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 373:
  tile = new Tile ("hud_coins.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 374:
  tile = new Tile ("hud_gem_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 375:
  tile = new Tile ("hud_gem_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 376:
  tile = new Tile ("hud_gem_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 377:
  tile = new Tile ("hud_gem_yellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 378:
  tile = new Tile ("hud_heartEmpty.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 379:
  tile = new Tile ("hud_heartFull.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 380:
  tile = new Tile ("hud_heartHalf.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 381:
  tile = new Tile ("hud_keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 382:
  tile = new Tile ("hud_keyBlue_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 383:
  tile = new Tile ("hud_keyGreem_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 384:
  tile = new keyGreen ("hud_keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 385:
  tile = new Tile ("hud_keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 386:
  tile = new Tile ("hud_keyRed_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 387:
  tile = new Tile ("hud_keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 388:
  tile = new Tile ("hud_keyYellow_disabled.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 389:
  tile = new Tile ("hud_p1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 390:
  tile = new Tile ("hud_p1Alt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 391:
  tile = new Tile ("hud_p2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 392:
  tile = new Tile ("hud_p2Alt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 393: 
  tile = new Tile ("hud_p3.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 394:
  tile = new Tile ("hud_p3Alt.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 395:
  tile = new Tile ("hud_x.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 396:
  tile = new Tile ("keyBlue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 397:
  tile = new Tile ("keyGreen.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 398:
  tile = new Tile ("keyRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 399:
  tile = new Tile ("keyYellow.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 400:
  tile = new Tile ("ladder_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 401:
  tile = new Tile ("ladder_top.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 402:
  tile = new Tile ("liquidLava.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 403:
  tile = new Tile ("liquidLavaTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 404:
  tile = new DangerousTiles ("liquidLavaTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 405:
  tile = new Tile ("liquidWater.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 406:
  tile = new Tile ("liquidWaterTop.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 407:
  tile = new DangerousTiles ("liquidWaterTop_mid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 408:
  tile = new Tile ("lock_blue.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 409:
  tile = new Tile ("lock_green.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 410:
  tile = new Tile ("lock_red.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 411:
  tile = new Tile ("mushroomBrown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 412:
  tile = new Tile ("mushroomRed.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 429:
  tile = new Tile ("particleBrick1a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 430:
  tile = new Tile ("particleBrick1b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 431:
  tile = new Tile ("particleBrick2a.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 432:
  tile = new Tile ("particleBrick2b.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 433:
  tile = new Tile ("plant.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 434:
  tile = new Tile ("plantPurple.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 435:
  tile = new Tile ("pokerMad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 436:
  tile = new Tile ("pokerSad.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 437:
  tile = new Tile ("rock.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 438:
  tile = new Tile ("signExit.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 439:
  tile = new Tile ("signLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 440:
  tile = new Tile ("signRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 441:
  tile = new Tile ("slimeDead.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 442:
  tile = new Tile ("slimeWalk1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 443:
  tile = new Tile ("slimeWalk2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 444:
  tile = new Tile ("snailShell.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 445:
  tile = new Tile ("snailShell_upsidedown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 446:
  tile = new Tile ("snailWalk1.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 447:
  tile = new Tile ("snailWalk2.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 448:
  tile = new Tile ("snowhill.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 449:
  tile = new Tile ("spikes.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 450:
  tile = new Tile ("springboardDown.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 451:
  tile = new Tile ("springboardUp.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 452:
  tile = new Tile ("star.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 453:
  tile = new Tile ("switchLeft.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 454:
  tile = new Tile ("switchMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 455:
  tile = new Tile ("switchRight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 456:
  tile = new Tile ("weight.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
 case 457:
  tile = new Tile ("weightChained.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
 break;
            default:
                tile = new Tile("grassMid.png", TileEngine.TILE_WIDTH, TileEngine.TILE_HEIGHT);
                tile.isSolid = true;
                break;
        }
        return tile;
    }
}


