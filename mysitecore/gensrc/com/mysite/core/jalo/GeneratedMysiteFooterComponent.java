/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at Feb 3, 2017 6:44:23 PM                      ---
 * ----------------------------------------------------------------
 */
package com.mysite.core.jalo;

import com.mysite.core.constants.MysiteCoreConstants;
import de.hybris.platform.acceleratorcms.jalo.components.FooterComponent;
import de.hybris.platform.cms2.jalo.contents.components.CMSLinkComponent;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.acceleratorcms.jalo.components.FooterComponent MysiteFooterComponent}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMysiteFooterComponent extends FooterComponent
{
	/** Qualifier of the <code>MysiteFooterComponent.text1</code> attribute **/
	public static final String TEXT1 = "text1";
	/** Qualifier of the <code>MysiteFooterComponent.text2</code> attribute **/
	public static final String TEXT2 = "text2";
	/** Qualifier of the <code>MysiteFooterComponent.text3</code> attribute **/
	public static final String TEXT3 = "text3";
	/** Qualifier of the <code>MysiteFooterComponent.link1</code> attribute **/
	public static final String LINK1 = "link1";
	/** Qualifier of the <code>MysiteFooterComponent.link2</code> attribute **/
	public static final String LINK2 = "link2";
	/** Qualifier of the <code>MysiteFooterComponent.link3</code> attribute **/
	public static final String LINK3 = "link3";
	/** Qualifier of the <code>MysiteFooterComponent.link4</code> attribute **/
	public static final String LINK4 = "link4";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>(FooterComponent.DEFAULT_INITIAL_ATTRIBUTES);
		tmp.put(TEXT1, AttributeMode.INITIAL);
		tmp.put(TEXT2, AttributeMode.INITIAL);
		tmp.put(TEXT3, AttributeMode.INITIAL);
		tmp.put(LINK1, AttributeMode.INITIAL);
		tmp.put(LINK2, AttributeMode.INITIAL);
		tmp.put(LINK3, AttributeMode.INITIAL);
		tmp.put(LINK4, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link1</code> attribute.
	 * @return the link1
	 */
	public CMSLinkComponent getLink1(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link1</code> attribute.
	 * @return the link1
	 */
	public CMSLinkComponent getLink1()
	{
		return getLink1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link1</code> attribute. 
	 * @param value the link1
	 */
	public void setLink1(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link1</code> attribute. 
	 * @param value the link1
	 */
	public void setLink1(final CMSLinkComponent value)
	{
		setLink1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link2</code> attribute.
	 * @return the link2
	 */
	public CMSLinkComponent getLink2(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link2</code> attribute.
	 * @return the link2
	 */
	public CMSLinkComponent getLink2()
	{
		return getLink2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link2</code> attribute. 
	 * @param value the link2
	 */
	public void setLink2(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link2</code> attribute. 
	 * @param value the link2
	 */
	public void setLink2(final CMSLinkComponent value)
	{
		setLink2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link3</code> attribute.
	 * @return the link3
	 */
	public CMSLinkComponent getLink3(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link3</code> attribute.
	 * @return the link3
	 */
	public CMSLinkComponent getLink3()
	{
		return getLink3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link3</code> attribute. 
	 * @param value the link3
	 */
	public void setLink3(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link3</code> attribute. 
	 * @param value the link3
	 */
	public void setLink3(final CMSLinkComponent value)
	{
		setLink3( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link4</code> attribute.
	 * @return the link4
	 */
	public CMSLinkComponent getLink4(final SessionContext ctx)
	{
		return (CMSLinkComponent)getProperty( ctx, LINK4);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.link4</code> attribute.
	 * @return the link4
	 */
	public CMSLinkComponent getLink4()
	{
		return getLink4( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link4</code> attribute. 
	 * @param value the link4
	 */
	public void setLink4(final SessionContext ctx, final CMSLinkComponent value)
	{
		setProperty(ctx, LINK4,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.link4</code> attribute. 
	 * @param value the link4
	 */
	public void setLink4(final CMSLinkComponent value)
	{
		setLink4( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text1</code> attribute.
	 * @return the text1
	 */
	public String getText1(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT1);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text1</code> attribute.
	 * @return the text1
	 */
	public String getText1()
	{
		return getText1( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text1</code> attribute. 
	 * @param value the text1
	 */
	public void setText1(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT1,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text1</code> attribute. 
	 * @param value the text1
	 */
	public void setText1(final String value)
	{
		setText1( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text2</code> attribute.
	 * @return the text2
	 */
	public String getText2(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT2);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text2</code> attribute.
	 * @return the text2
	 */
	public String getText2()
	{
		return getText2( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text2</code> attribute. 
	 * @param value the text2
	 */
	public void setText2(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT2,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text2</code> attribute. 
	 * @param value the text2
	 */
	public void setText2(final String value)
	{
		setText2( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text3</code> attribute.
	 * @return the text3
	 */
	public String getText3(final SessionContext ctx)
	{
		return (String)getProperty( ctx, TEXT3);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>MysiteFooterComponent.text3</code> attribute.
	 * @return the text3
	 */
	public String getText3()
	{
		return getText3( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text3</code> attribute. 
	 * @param value the text3
	 */
	public void setText3(final SessionContext ctx, final String value)
	{
		setProperty(ctx, TEXT3,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>MysiteFooterComponent.text3</code> attribute. 
	 * @param value the text3
	 */
	public void setText3(final String value)
	{
		setText3( getSession().getSessionContext(), value );
	}
	
}
