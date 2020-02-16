var app = new Vue({
    el: '#app',
    data: {
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
    methods: {
        handleCreateClick() {
            console.log('create click');
            this.createProduct();
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
        createProduct() {
            axios.post('/product/create', {
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
                    alert('创建成功');
                })
                .catch(function (error) {
                    console.log(error);
                });
        }
    }
})