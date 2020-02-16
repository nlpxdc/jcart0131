var app = new Vue({
    el: '#app',
    data: {
        productId: '',
        productCode: '',
        productName: '',
        description: '',
        price: '',
        discount: '',
        quantity: '',
        rewordPoints: '',
        statuses: [
            { value: 0, label: '下架' },
            { value: 1, label: '上架' },
            { value: 2, label: '待审核' }
        ],
        selectedStatus: 1,
        selectImage: '',
        mainPicUrl: '',
        fileList: []
    },
    mounted() {
        console.log('view mounted');

        var url = new URL(location.href);
        this.productId = url.searchParams.get("productId");
        if (!this.productId) {
            alert('productId is null');
            return;
        }

        this.getProduct();
    },
    methods: {
        handleUpdateClick() {
            console.log('update click');
            this.updateProduct();
        },
        handleUploadClick() {
            console.log('upload click');
            this.$refs.upload.submit();
        },
        handleOnChange(val) {
            console.log('image change', val);
            this.selectImage = val.raw;
        },
        uploadImage() {
            var formData = new FormData();
            formData.append("image", this.selectImage);

            axios.post('/image/upload', formData, {
                headers: {
                    'Content-Type': 'multipart/form-data'
                }
            })
                .then(function (response) {
                    console.log(response);
                    app.mainPicUrl = response.data;
                    alert('上传成功');
                })
                .catch(function (error) {
                    console.log(error);
                    alert('上传失败');
                });
        },
        getProduct() {
            axios.get('/product/getById', {
                params: {
                    productId: this.productId
                }
            })
                .then(function (response) {
                    console.log(response);
                    var product = response.data;
                    app.productId = product.productId;
                    app.productCode = product.productCode;
                    app.productName = product.productName;
                    app.mainPicUrl = product.mainPicUrl;
                    app.description = product.description;
                    app.price = product.price;
                    app.discount = product.discount;
                    app.quantity = product.quantity;
                    app.rewordPoints = product.rewordPoints;
                    app.selectedStatus = product.status;
                })
                .catch(function (error) {
                    console.log(error);
                });
        },
        updateProduct() {
            axios.post('/product/update', {
                productId: this.productId,
                productCode: this.productCode,
                productName: this.productName,
                price: this.price,
                discount: this.discount,
                quantity: this.quantity,
                status: this.selectedStatus,
                rewordPoints: this.rewordPoints,
                mainPicUrl: this.mainPicUrl,
                description: this.description
            })
                .then(function (response) {
                    console.log(response);
                    alert('更新成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})