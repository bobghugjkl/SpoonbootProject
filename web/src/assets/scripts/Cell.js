export class Cell{
    //前十步每一步蛇的长度变长1，之后每三步变一步
    //画圈格子，先定义一个格子方便画
    constructor(r, c) {
        //先把行数和列数存下来
        this.r = r;
        this.c = c;
        //因为是中心对称，要找中心点坐标（是canvas画布，存在坐标变换，因为是要画圆，所以要在中心坐标画）
        this.x = c + 0.5;
        this.y = r + 0.5;

    }
}