package cn.beijing.ssfh.entity;

public class Menu {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_id
     *
     * @mbggenerated
     */
    private Integer menuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.url_address
     *
     * @mbggenerated
     */
    private String urlAddress;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_id
     *
     * @return the value of menu.menu_id
     *
     * @mbggenerated
     */
    public Integer getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_id
     *
     * @param menuId the value for menu.menu_id
     *
     * @mbggenerated
     */
    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.url_address
     *
     * @return the value of menu.url_address
     *
     * @mbggenerated
     */
    public String getUrlAddress() {
        return urlAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.url_address
     *
     * @param urlAddress the value for menu.url_address
     *
     * @mbggenerated
     */
    public void setUrlAddress(String urlAddress) {
        this.urlAddress = urlAddress == null ? null : urlAddress.trim();
    }
}